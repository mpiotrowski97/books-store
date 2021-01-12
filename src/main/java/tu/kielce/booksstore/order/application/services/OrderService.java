package tu.kielce.booksstore.order.application.services;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.cart.application.services.CartService;
import tu.kielce.booksstore.order.application.mappers.OrdersMapper;
import tu.kielce.booksstore.order.domain.*;
import tu.kielce.booksstore.order.presentation.http.model.request.NewOrderModel;
import tu.kielce.booksstore.order.presentation.http.model.request.OrderItemModel;
import tu.kielce.booksstore.order.presentation.http.model.response.NewOrderResponse;
import tu.kielce.booksstore.order.presentation.http.model.response.OrderHistoryModel;
import tu.kielce.booksstore.payment.application.services.PaymentService;
import tu.kielce.booksstore.user.services.SecurityUserService;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final SecurityUserService securityUserService;
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;
    private final CartService cartService;
    private final OrdersMapper ordersMapper;
    private final PaymentService paymentService;

    @Transactional
    public NewOrderResponse createOrder(NewOrderModel newOrderModel) {
        val orderAddress = newOrderModel.getAddress();
        val currentUser = securityUserService.getCurrentLoggedUser();
        val itemsCost = countItemsCost(newOrderModel.getItems());
        val shippingMethod = newOrderModel.getShipmentMethod();

        Order order = orderRepository.save(Order
                .builder()
                .city(orderAddress.getCity())
                .country(orderAddress.getCountry())
                .houseNumber(orderAddress.getHouseNumber())
                .postcode(orderAddress.getPostcode())
                .province(orderAddress.getProvince())
                .street(orderAddress.getStreet())
                .firstName(currentUser.getFirstName())
                .lastName(currentUser.getLastName())
                .phoneNumber(currentUser.getPhoneNumber())
                .productsCost(itemsCost)
                .shippingCost(shippingMethod.getPrice())
                .shippingMethod(shippingMethod.getName())
                .userId(currentUser.getId())
                .status(OrderStatus.UNPAID)
                .value(itemsCost.add(shippingMethod.getPrice()))
                .email(currentUser.getEmail())
                .build()
        );

        for (OrderItemModel orderItemModel : newOrderModel.getItems()) {
            order.addOrderItem(orderItemRepository.save(
                    OrderItem
                            .builder()
                            .order(order)
                            .bookIsbn(orderItemModel.getId().toString())
                            .price(orderItemModel.getBookPrice())
                            .quantity(orderItemModel.getQuantity())
                            .title(orderItemModel.getBookTitle())
                            .value(orderItemModel.getValue())
                            .build()
            ));
        }

        val paymentResponse = paymentService.createPayment(order);

        order.setExternalId(paymentResponse.getOrderId());
        orderRepository.save(order);

        return NewOrderResponse.builder().redirectUrl(paymentResponse.getRedirectUri()).build();
    }

    private BigDecimal countItemsCost(List<OrderItemModel> items) {
        return items.stream()
                .map(item -> item.getBookPrice().multiply(BigDecimal.valueOf(item.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<OrderHistoryModel> currentUserOrders() {
        val loggedUser = securityUserService.getCurrentLoggedUser();
        return orderRepository.findAllByUserId(loggedUser.getId())
                .stream()
                .map(ordersMapper::toOrderHistory)
                .collect(Collectors.toList());
    }

    public List<Order> getUnpaidOrders() {
        return orderRepository.findAllByStatus(OrderStatus.UNPAID);
    }

    public void changeOrderStatus(Order order, OrderStatus status) {
        order.setStatus(status);
        orderRepository.save(order);
    }
}
