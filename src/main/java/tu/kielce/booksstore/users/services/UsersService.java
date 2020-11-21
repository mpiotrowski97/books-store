package tu.kielce.booksstore.users.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.security.domain.SecurityUserDetails;
import tu.kielce.booksstore.users.domain.User;
import tu.kielce.booksstore.users.domain.UserRepository;
import tu.kielce.booksstore.users.exceptions.CannotDeleteYourselfException;
import tu.kielce.booksstore.users.exceptions.UserExistsException;
import tu.kielce.booksstore.users.validators.UserValidator;
import tu.kielce.booksstore.users.exceptions.UserDoesNotExistException;
import tu.kielce.booksstore.users.web.model.UserCreateModel;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final UserValidator userValidator;

    public User create(UserCreateModel userCreateModel) throws UserExistsException {
        User user = User
                .builder()
                .email(userCreateModel.getEmail())
                .roles(userCreateModel.getUserTypes())
                .username(userCreateModel.getUsername())
                .enabled(userCreateModel.isEnabled())
                .password(passwordEncoder.encode(userCreateModel.getPassword()))
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

    public void delete(UUID id) {
        User user = userRepository
                .findById(id)
                .orElseThrow(UserDoesNotExistException::new);

        SecurityUserDetails securityUserDetails = (SecurityUserDetails) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();

        if (user.getEmail().equals(securityUserDetails.getEmail())) {
            throw new CannotDeleteYourselfException();
        }

        userRepository.delete(user);
    }
}
