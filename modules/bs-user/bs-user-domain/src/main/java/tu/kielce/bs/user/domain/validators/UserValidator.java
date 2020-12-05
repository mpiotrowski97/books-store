package tu.kielce.bs.user.domain.validators;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tu.kielce.bs.users.domain.User;
import tu.kielce.bs.users.domain.UserRepository;

@Component
@RequiredArgsConstructor
public class UserValidator {
    private final UserRepository userRepository;

    public boolean isUniqueUser(User user) {
        return userRepository
                .findByUsernameOrEmailAndIdNot(user.getUsername(), user.getEmail(), user.getId())
                .isEmpty();
    }
}
