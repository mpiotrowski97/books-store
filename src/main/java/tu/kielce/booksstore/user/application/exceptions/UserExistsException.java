package tu.kielce.booksstore.user.application.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNPROCESSABLE_ENTITY, reason = "User already exists")
public class UserExistsException extends RuntimeException {
}
