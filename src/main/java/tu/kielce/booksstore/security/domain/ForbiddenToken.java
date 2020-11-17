package tu.kielce.booksstore.security.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "forbidden_tokens")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ForbiddenToken {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, updatable = false, nullable = false)
    private UUID code;

    @Column(length = 36)
    private UUID userId;
}
