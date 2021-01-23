package tu.kielce.booksstore.user.presentation.web.model;

import lombok.Builder;
import lombok.Getter;
import tu.kielce.booksstore.user.domain.dto.CurrentLoggedUser;

@Builder
@Getter
public class LoginModel {
    private final CurrentLoggedUser user;
}
