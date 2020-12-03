package tu.kielce.bs.book.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "books")
@Getter
@Setter
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
}
