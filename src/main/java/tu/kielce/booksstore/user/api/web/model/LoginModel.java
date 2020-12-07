package tu.kielce.booksstore.user.api.web.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LoginModel {
    private final AuthUserModel user;
}
