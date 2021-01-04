package tu.kielce.booksstore.order.presentation.http.model.request;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class OrderShipmentModel {
    private UUID id;
    private String name;
    private BigDecimal price;
}
