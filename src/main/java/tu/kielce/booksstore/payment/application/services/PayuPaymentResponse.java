package tu.kielce.booksstore.payment.application.services;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PayuPaymentResponse {
    private String redirectUri;
}
