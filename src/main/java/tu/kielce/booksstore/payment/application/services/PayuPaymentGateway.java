package tu.kielce.booksstore.payment.application.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.val;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import tu.kielce.booksstore.order.domain.Order;
import tu.kielce.booksstore.payment.domain.dto.PaymentGatewayAuth;
import tu.kielce.booksstore.payment.infrastructure.config.PayuGatewayConfiguration;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Log4j2
public class PayuPaymentGateway implements PaymentGateway {
    private final static String ORDER_API_URI = "/api/v2_1/orders";
    private final static String OAUTH_URI = "/pl/standard/user/oauth/authorize";

    private final PayuGatewayConfiguration payuGatewayConfiguration;
    private final RestTemplate restTemplate;
    private final HttpServletRequest httpServletRequest;

    @Override
    public PaymentGatewayAuth authenticate() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        parameters.add("grant_type", "client_credentials");
        parameters.add("client_id", payuGatewayConfiguration.getClientId());
        parameters.add("client_secret", payuGatewayConfiguration.getClientSecret());

        PayuAuthResponse response = restTemplate.postForEntity(
                makeUrl(OAUTH_URI),
                new HttpEntity<>(parameters, headers),
                PayuAuthResponse.class
        ).getBody();

        return Optional.ofNullable(response)
                .map(payuResponse -> PaymentGatewayAuth.builder()
                        .accessToken(payuResponse.getAccess_token())
                        .expiresIn(payuResponse.getExpires_in()).build()
                )
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public PayuPaymentResponse createPayment(Order order, String accessToken) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(accessToken);

        return restTemplate.postForEntity(
                makeUrl(ORDER_API_URI),
                new HttpEntity<>(createPaymentRequest(order), headers),
                PayuPaymentResponse.class
        ).getBody();
    }

    private NewPayment createPaymentRequest(Order order) {
        val buyer = NewPaymentBuyer.builder()
                .email(order.getEmail())
                .firstName(order.getFirstName())
                .lastName(order.getLastName())
                .phone(order.getPhoneNumber())
                .language("en")
                .build();

        List<NewPaymentItem> items = order.getOrderItems().stream()
                .map(item -> NewPaymentItem.builder()
                        .name(item.getTitle())
                        .quantity(item.getQuantity())
                        .unitPrice(item.getValue().multiply(BigDecimal.valueOf(100)).toBigInteger().toString()).build()
                )
                .collect(Collectors.toList());

        return NewPayment
                .builder()
                .buyer(buyer)
                .products(items)
                .notifyUrl(payuGatewayConfiguration.getNotifyUrl())
                .customerIp("192.168.2.42")
                .extOrderId(order.getId().toString())
                .merchantPosId(payuGatewayConfiguration.getPosId())
                .description(payuGatewayConfiguration.getStoreName())
                .currencyCode(payuGatewayConfiguration.getCurrency())
                .totalAmount(order.getValue().multiply(BigDecimal.valueOf(100)).toBigInteger().toString())
                .build();
    }

    private String makeUrl(String uri) {
        return String.format("%s%s", payuGatewayConfiguration.getUrl(), uri);
    }
}
