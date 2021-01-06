package tu.kielce.booksstore.payment.application.services;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PayuPaymentResponse {
    private String redirectUri;
}
