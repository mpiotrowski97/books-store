package tu.kielce.booksstore.order.application.services;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.cart.application.services.CartService;
import tu.kielce.booksstore.order.domain.Order;
import tu.kielce.booksstore.order.domain.OrderItem;
import tu.kielce.booksstore.order.domain.OrderItemRepository;
import tu.kielce.booksstore.order.domain.OrderRepository;
import tu.kielce.booksstore.order.presentation.http.model.request.NewOrderModel;
import tu.kielce.booksstore.order.presentation.http.model.request.OrderItemModel;
import tu.kielce.booksstore.user.services.SecurityUserService;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final SecurityUserService securityUserService;
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;
    private final CartService cartService;

    @Transactional
    public void createOrder(NewOrderModel newOrderModel) {
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
                .phoneNumber(currentUser.getLastName())
                .productsCost(itemsCost)
                .shippingCost(shippingMethod.getPrice())
                .shippingMethod(shippingMethod.getName())
                .userId(currentUser.getId())
                .value(itemsCost.add(shippingMethod.getPrice()))
                .build()
        );

        for (OrderItemModel orderItemModel : newOrderModel.getItems()) {
            orderItemRepository.save(
                    OrderItem
                            .builder()
                            .orderId(order.getId())
                            .bookIsbn(orderItemModel.getId().toString())
                            .price(orderItemModel.getBookPrice())
                            .quantity(orderItemModel.getQuantity())
                            .title(orderItemModel.getBookTitle())
                            .value(orderItemModel.getValue())
                            .build()
            );
        }

        cartService.clearUserCart(currentUser.getId());
    }

    private BigDecimal countItemsCost(List<OrderItemModel> items) {
        return items.stream()
                .map(item -> item.getBookPrice().multiply(BigDecimal.valueOf(item.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
