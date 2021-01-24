package tu.kielce.booksstore.book.presentation.model;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Data
public class CreateBookModel {
    @NotNull
    private String isbn;

    @NotNull
    private String author;

    private String description;

    @NotNull
    private String publishedBy;

    @NotNull
    private String title;

    @NotNull
    private UUID category;

    @NotNull
    @Min(0)
    @Max(10000)
    private BigDecimal price;

    @NotNull
    @Min(0)
    @Max(10000)
    private int quantity;
}
