package tu.kielce.booksstore.users.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Arrays;
import java.util.UUID;
import java.util.stream.Collectors;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder()
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, updatable = false, nullable = false)
    @Type(type = "uuid-char")
    private UUID id;

    @Column(nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Setter
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String roles;

    @Column()
    private boolean enabled;

    public String[] getRoles() {
        if (null == roles) {
            return new String[0];
        }

        return roles.split(",");
    }

    public static class UserBuilder {
        private String roles;


        public UserBuilder roles(UserType[] roles) {
            this.roles = Arrays.stream(roles).map(UserType::toString).collect(Collectors.joining(","));
            return this;
        }
    }

    public void enable() {
        this.enabled = true;
    }
}
