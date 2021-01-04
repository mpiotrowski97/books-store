package tu.kielce.booksstore.order.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "orders")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, updatable = false, nullable = false)
    @Type(type = "uuid-char")
    private UUID id;

    @Column(length = 36)
    @Type(type = "uuid-char")
    private UUID userId;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String street;

    private String houseNumber;

    private String city;

    private String postcode;

    private String province;

    private String country;

    private String shippingMethod;

    private BigDecimal shippingCost;

    private BigDecimal productsCost;

    private BigDecimal value;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    private Set<OrderItem> orderItems;
}
