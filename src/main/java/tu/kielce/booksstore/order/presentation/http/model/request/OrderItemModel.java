package tu.kielce.booksstore.order.presentation.http.model.request;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class OrderItemModel {
    private BigDecimal bookPrice;
    private String bookTitle;
    private String bookIsbn;
    private UUID id;
    private int quantity;
    private BigDecimal value;
}
