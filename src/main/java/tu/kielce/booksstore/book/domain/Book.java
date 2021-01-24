package tu.kielce.booksstore.book.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "books")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @Column(length = 13, updatable = false, nullable = false)
    private String isbn;

    private String title;

    private String author;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String publishedBy;

    private BigDecimal price;

    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    public boolean hasQuantity(int quantity) {
        return quantity > this.quantity;
    }
}
