package tu.kielce.booksstore.order.application.mappers;

import org.springframework.stereotype.Component;
import tu.kielce.booksstore.order.domain.Order;
import tu.kielce.booksstore.order.domain.OrderItem;
import tu.kielce.booksstore.order.presentation.http.model.response.OrderHistoryModel;

@Component
public class OrdersMapper {
    public OrderHistoryModel toOrderHistory(Order order) {
        return OrderHistoryModel
                .builder()
                .items(order.getOrderItems().stream().map(OrderItem::getQuantity).reduce(1, Integer::sum))
                .orderId(order.getId())
                .value(order.getValue())
                .build();
    }
}
