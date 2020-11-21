package tu.kielce.booksstore.users.web.model;

import lombok.Builder;
import lombok.Getter;
import tu.kielce.booksstore.users.domain.UserType;

import java.util.Arrays;

@Builder
@Getter
public class UserCreateModel {
    private final String email;
    private final String username;
    private final String password;
    private final String[] roles;
    private final boolean enabled;

    public UserType[] getUserTypes() {
        return Arrays.stream(roles).map(UserType::valueOf).toArray(UserType[]::new);
    }
}
