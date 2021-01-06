package tu.kielce.booksstore.payment.infrastructure.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class PayuGatewayConfiguration {
    @Value("${bs.payment.payu.url}")
    private String url;
    @Value("${bs.payment.payu.clientId}")
    private String clientId;
    @Value("${bs.payment.payu.clientSecret}")
    private String clientSecret;
}
