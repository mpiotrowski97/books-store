package tu.kielce.booksstore.users.events;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import tu.kielce.booksstore.users.domain.User;

@Getter
@RequiredArgsConstructor
@Builder(builderMethodName = "of")
public class UserRegisteredEvent{
    private final User user;
}
