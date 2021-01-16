package tu.kielce.booksstore.review.application;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNPROCESSABLE_ENTITY, reason = "Review does not exist.")
public class ReviewDoesNotExistException extends RuntimeException {
}
