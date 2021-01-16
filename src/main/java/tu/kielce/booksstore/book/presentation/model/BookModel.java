package tu.kielce.booksstore.book.presentation.model;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class BookModel {
    private final String isbn;
    private final String author;
    private final String publishedBy;
    private final String title;
    private final String category;
    private final String description;
    private final BigDecimal price;
    private final int quantity;
}
