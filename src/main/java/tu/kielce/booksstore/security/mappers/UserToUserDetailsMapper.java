package tu.kielce.booksstore.security.mappers;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import tu.kielce.booksstore.security.domain.SecurityUserDetails;
import tu.kielce.booksstore.users.domain.User;

import java.util.Arrays;
import java.util.stream.Collectors;

@Component
public class UserToUserDetailsMapper {
    public SecurityUserDetails map(User user) {
        return SecurityUserDetails
                .builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .enabled(user.isEnabled())
                .email(user.getEmail())
                .authorities(
                        Arrays.stream(user.getRoles()).map(SimpleGrantedAuthority::new).collect(Collectors.toSet())
                )
                .build();
    }
}
