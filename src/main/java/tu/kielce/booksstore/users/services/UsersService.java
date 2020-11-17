package tu.kielce.booksstore.users.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.users.domain.User;
import tu.kielce.booksstore.users.domain.UserRepository;
import tu.kielce.booksstore.users.domain.UserType;
import tu.kielce.booksstore.users.exceptions.UserExistsException;
import tu.kielce.booksstore.users.validators.UserValidator;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final UserValidator userValidator;

    public User create(
            String username,
            String password,
            String email,
            UserType[] roles,
            boolean enabled
    ) throws UserExistsException {
        User user = User
                .builder()
                .email(email)
                .roles(roles)
                .username(username)
                .enabled(enabled)
                .password(passwordEncoder.encode(password))
                .build();

        if (!userValidator.isUniqueUser(user)) {
            throw new UserExistsException();
        }

        return userRepository.save(user);
    }

    public void changePassword(UUID userId, String password) {
        User user = userRepository.findById(userId).orElse(null);

        if (null == user) {
            return;
        }

        user.setPassword(passwordEncoder.encode(password));
    }

    public void enableUser(UUID userId) {
        User user = userRepository
                .findById(userId)
                .orElse(null);

        if (null == user) {
            return;
        }

        user.enable();
    }
}
