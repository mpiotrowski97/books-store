package tu.kielce.booksstore.shelf.application;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNPROCESSABLE_ENTITY, reason = "Book exists on the shelf.")
public class BookExistsOnShelfException extends RuntimeException {
}
