package tu.kielce.booksstore.users.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.users.domain.User;
import tu.kielce.booksstore.users.domain.UserRepository;
import tu.kielce.booksstore.users.validators.UserValidator;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final UserValidator userValidator;

    public User create(String username, String password, String email) {
        User user =                 User
                .builder()
                .email(email)
                .roles("")
                .username(username)
                .password(passwordEncoder.encode(password))
                .build();

        if (!userValidator.isUniqueUser(user)) {
            throw new RuntimeException("User already exists");
        }

        return userRepository.save(user);
    }
}
