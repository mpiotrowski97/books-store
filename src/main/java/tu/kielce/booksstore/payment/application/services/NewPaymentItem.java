package tu.kielce.booksstore.payment.application.services;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewPaymentItem {
    private String name;
    private String unitPrice;
    private int quantity;
}
