package tu.kielce.booksstore.books.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
