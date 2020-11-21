package tu.kielce.booksstore.users.web.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserModel {
    private final String username;
    private final String email;
    private final String[] roles;
}
