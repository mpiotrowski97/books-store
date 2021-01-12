package tu.kielce.booksstore.order.application.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tu.kielce.booksstore.order.application.services.OrderService;
import tu.kielce.booksstore.order.domain.Order;
import tu.kielce.booksstore.order.domain.OrderStatus;
import tu.kielce.booksstore.payment.application.services.PaymentService;

import javax.transaction.Transactional;

@Component
@RequiredArgsConstructor
public class OrderStatusTask {
    private final static String COMPLETED_STATUS = "COMPLETED";

    private final PaymentService paymentService;
    private final OrderService orderService;

    @Scheduled(fixedRate = 5000)
    @Transactional
    public void checkOrdersStatus() {
        val unpaidOrders = orderService.getUnpaidOrders();

        for (Order order : unpaidOrders) {
            val payuResponse = paymentService.checkPayment(order);
            payuResponse
                    .getOrders()
                    .stream()
                    .filter(payuOrder -> payuOrder.getOrderId().equals(order.getExternalId()) && payuOrder.getStatus().equals(COMPLETED_STATUS))
                    .findFirst()
                    .ifPresent(payuOrder -> orderService.changeOrderStatus(order, OrderStatus.PAID));

        }
    }
}
