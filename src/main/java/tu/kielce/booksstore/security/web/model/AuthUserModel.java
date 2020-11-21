package tu.kielce.booksstore.security.web.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AuthUserModel {
    private final String email;
    private final String username;
    private final String[] roles;
}
