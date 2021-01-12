package tu.kielce.booksstore.payment.application.services;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PayuCheckPaymentResponse {
    private List<PayuOrder> orders;
}
