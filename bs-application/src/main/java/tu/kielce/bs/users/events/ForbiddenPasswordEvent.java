package tu.kielce.bs.users.events;

import lombok.Builder;
import lombok.Getter;
import tu.kielce.bs.users.domain.User;

@Builder(builderMethodName = "of")
@Getter
public class ForbiddenPasswordEvent {
    private final User user;
}
