package tu.kielce.booksstore.payment.application.services;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PayuOrder {
    private String status;
    private String orderId;
}
