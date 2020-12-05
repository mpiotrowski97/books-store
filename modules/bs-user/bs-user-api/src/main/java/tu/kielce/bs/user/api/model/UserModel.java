package tu.kielce.bs.user.api.model;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class UserModel {
    private final UUID id;
    private final String username;
    private final String email;
    private final String[] roles;
    private final boolean enabled;
}
