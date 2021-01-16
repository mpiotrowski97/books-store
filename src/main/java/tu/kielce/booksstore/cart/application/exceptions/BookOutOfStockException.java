package tu.kielce.booksstore.cart.application.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNPROCESSABLE_ENTITY, reason = "Book is out of stock.")
public class BookOutOfStockException extends RuntimeException {
}
