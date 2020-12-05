package tu.kielce.bs.user.domain.events;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import tu.kielce.bs.users.domain.User;

@Getter
@RequiredArgsConstructor
@Builder(builderMethodName = "of")
public class UserRegisteredEvent{
    private final User user;
}
