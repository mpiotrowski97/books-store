package tu.kielce.booksstore.security.services;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.security.events.UserRegisteredEvent;
import tu.kielce.booksstore.security.web.model.RegisterModel;
import tu.kielce.booksstore.users.UsersFacade;
import tu.kielce.booksstore.users.domain.User;
import tu.kielce.booksstore.users.domain.UserType;
import tu.kielce.booksstore.users.exceptions.UserExistsException;


@Service
@RequiredArgsConstructor
public class AuthService {
    private final UsersFacade usersFacade;
    private final ApplicationEventPublisher applicationEventPublisher;

    public void register(RegisterModel registerModel) throws UserExistsException {
        User user = usersFacade.createUser(
                registerModel.getUsername(),
                registerModel.getPassword(),
                registerModel.getEmail(),
                new UserType[]{UserType.ROLE_USER},
                false
        );

        applicationEventPublisher.publishEvent(UserRegisteredEvent.of().user(user).build());
    }

}
