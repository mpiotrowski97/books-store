package tu.kielce.booksstore.cart.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "cart_items")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, updatable = false, nullable = false)
    @Type(type = "uuid-char")
    private UUID id;

    @Column(length = 36)
    @Type(type = "uuid-char")
    private UUID userId;

    private String bookIsbn;

    private int quantity;

    public void addQuantity(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public void changeQuantity(int quantity) {
        this.quantity = quantity;
    }
}
