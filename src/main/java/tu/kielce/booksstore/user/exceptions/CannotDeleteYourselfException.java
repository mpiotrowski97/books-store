package tu.kielce.booksstore.user.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNPROCESSABLE_ENTITY, reason = "Cannot delete yourself")
public class CannotDeleteYourselfException extends RuntimeException {
}
