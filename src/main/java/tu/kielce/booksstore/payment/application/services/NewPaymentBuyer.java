package tu.kielce.booksstore.payment.application.services;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewPaymentBuyer {
    private String email;
    private String phone;
    private String firstName;
    private String lastName;
    private String language;
}
