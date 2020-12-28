package tu.kielce.booksstore.order.api.web.model.request;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class OrderItemModel {
    private BigDecimal bookPrice;
    private String bookTitle;
    private UUID id;
    private int quantity;
    private BigDecimal value;
}
