package tu.kielce.booksstore.cart.domain.dto;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class CartItemDto {
    private final UUID id;
    private final String bookIsbn;
    private final String bookTitle;
    private final BigDecimal bookPrice;
    private final int quantity;
    private final BigDecimal value;

    public CartItemDto(UUID id, String bookIsbn, String bookTitle, BigDecimal bookPrice, int quantity) {
        this.id = id;
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.quantity = quantity;
        value = bookPrice.multiply(new BigDecimal(quantity));
    }
}

