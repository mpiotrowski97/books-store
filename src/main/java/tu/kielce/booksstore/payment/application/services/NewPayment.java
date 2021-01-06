package tu.kielce.booksstore.payment.application.services;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class NewPayment {
    private String notifyUrl;
    private String customerIp;
    private String merchantPosId;
    private String description;
    private String currencyCode;
    private String totalAmount;
    private NewPaymentBuyer newPaymentBuyer;
    private List<NewPaymentItem> products;
}
