package tu.kielce.booksstore.shelf.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "shelves")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Shelf {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, updatable = false, nullable = false)
    @Type(type = "uuid-char")
    private UUID id;

    @Column(length = 36)
    @Type(type = "uuid-char")
    private UUID userId;

    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shelf")
    private Set<BookShelf> books;
}
