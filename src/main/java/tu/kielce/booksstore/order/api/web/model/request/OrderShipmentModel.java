package tu.kielce.booksstore.order.api.web.model.request;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class OrderShipmentModel {
    private UUID id;
    private String name;
    private BigDecimal price;
}
