package tu.kielce.booksstore.order.presentation.http.model.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class NewOrderResponse {
    private final String code;
}
