package tu.kielce.booksstore.security.events;

import lombok.Builder;
import lombok.Getter;
import tu.kielce.booksstore.users.domain.User;

@Builder(builderMethodName = "of")
@Getter
public class ForbiddenPasswordEvent {
    private final User user;
}
