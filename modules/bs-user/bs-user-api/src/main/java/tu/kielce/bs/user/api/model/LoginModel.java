package tu.kielce.bs.user.api.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LoginModel {
    private final AuthUserModel user;
}
