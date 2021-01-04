package tu.kielce.booksstore.shelf.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import tu.kielce.booksstore.order.domain.Order;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "book_shelf")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookShelf {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, updatable = false, nullable = false)
    @Type(type = "uuid-char")
    private UUID id;

    private String bookIsbn;

    @ManyToOne
    @JoinColumn(name="shelf_id", nullable=false)
    private Shelf shelf;
}
