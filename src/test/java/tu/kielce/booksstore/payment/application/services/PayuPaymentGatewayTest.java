package tu.kielce.booksstore.payment.application.services;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import tu.kielce.booksstore.payment.infrastructure.config.PayuGatewayConfiguration;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@Log4j2
public class PayuPaymentGatewayTest {
    private final static String OAUTH_URI = "/pl/standard/user/oauth/authorize";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private PayuGatewayConfiguration payuGatewayConfiguration;

    @Test
    public void test() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        parameters.add("grant_type", "client_credentials");
        parameters.add("client_id", payuGatewayConfiguration.getClientId());
        parameters.add("client_secret", payuGatewayConfiguration.getClientSecret());

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity(parameters, headers);

        ResponseEntity<PayuAuthResponse> response = restTemplate.postForEntity(makeUrl(OAUTH_URI), request, PayuAuthResponse.class);

        System.out.println(response.getStatusCode());
        System.out.println(response.toString());
    }

    private String makeUrl(String uri) {
        return String.format("%s%s", payuGatewayConfiguration.getUrl(), uri);
    }
}
