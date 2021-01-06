package tu.kielce.booksstore.payment.application.services;

import lombok.Data;

@Data
public class PayuAuthResponse {
    private String access_token;
    private String token_type;
    private String expires_in;
    private String grant_type;
}
