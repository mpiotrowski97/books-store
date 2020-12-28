package tu.kielce.booksstore.order.api.web.model.request;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
public class CreateOrderModel {
    private OrderAddressModel address;
    private List<OrderItemModel> items;
    private OrderShipmentModel shipmentMethod;
    private BigDecimal value;
}
