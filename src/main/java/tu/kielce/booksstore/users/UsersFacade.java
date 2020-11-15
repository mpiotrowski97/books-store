package tu.kielce.booksstore.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.users.domain.User;
import tu.kielce.booksstore.users.domain.UserRepository;
import tu.kielce.booksstore.users.domain.UserType;
import tu.kielce.booksstore.users.exceptions.UserExistsException;
import tu.kielce.booksstore.users.services.UsersService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersFacade {
    private final UserRepository userRepository;
    private final UsersService usersService;

    public Optional<User> getUser(String username) {
        return userRepository.findByUsername(username);
    }

    public void createUser(
            String username,
            String password,
            String email,
            UserType[] roles
    ) throws UserExistsException {
        usersService.create(username, password, email, roles);
    }
}
