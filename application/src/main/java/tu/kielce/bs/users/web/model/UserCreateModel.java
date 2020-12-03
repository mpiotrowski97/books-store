package tu.kielce.bs.users.web.model;

import lombok.Builder;
import lombok.Getter;
import tu.kielce.bs.users.domain.UserType;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Arrays;

@Builder
@Getter
public class UserCreateModel {
    @NotNull
    @Email
    private final String email;

    @NotNull
    private final String username;

    @NotNull
    private final String password;

    @NotNull
    private final String[] roles;

    @NotNull
    private final boolean enabled;

    public UserType[] getUserTypes() {
        return Arrays.stream(roles).map(UserType::valueOf).toArray(UserType[]::new);
    }
}
