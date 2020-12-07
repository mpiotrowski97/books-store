package tu.kielce.booksstore.user.api.facade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tu.kielce.booksstore.user.domain.dto.CurrentLoggedUser;
import tu.kielce.booksstore.user.services.SecurityUserService;

@Component
@RequiredArgsConstructor
public class UserFacade {
    private final SecurityUserService securityUserService;

    public CurrentLoggedUser getCurrentLoggedUser() {
        return securityUserService.getCurrentLoggedUser();
    }
}
