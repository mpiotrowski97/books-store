package tu.kielce.booksstore.user.infrastructure.validators;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tu.kielce.booksstore.user.domain.User;
import tu.kielce.booksstore.user.domain.UserRepository;

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
