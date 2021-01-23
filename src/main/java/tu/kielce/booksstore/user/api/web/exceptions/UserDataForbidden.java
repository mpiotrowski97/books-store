package tu.kielce.booksstore.user.api.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY, reason = "Email is used")
public class UserDataForbidden extends RuntimeException {
}
