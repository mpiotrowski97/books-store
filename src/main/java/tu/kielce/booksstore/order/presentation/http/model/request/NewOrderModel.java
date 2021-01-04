package tu.kielce.booksstore.order.presentation.http.model.request;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
public class NewOrderModel {
    private OrderAddressModel address;
    private List<OrderItemModel> items;
    private OrderShipmentModel shipmentMethod;
    private BigDecimal value;
}
