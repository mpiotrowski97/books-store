package tu.kielce.booksstore.book.presentation.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNPROCESSABLE_ENTITY, reason = "Book does not exist")
public class BookNotFoundException extends RuntimeException {
}
