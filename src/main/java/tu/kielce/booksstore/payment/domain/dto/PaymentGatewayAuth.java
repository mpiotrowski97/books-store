package tu.kielce.booksstore.payment.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PaymentGatewayAuth {
    private final String accessToken;
    private final String expiresIn;
}
