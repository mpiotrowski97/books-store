package tu.kielce.booksstore.payment.application.services;

import tu.kielce.booksstore.order.domain.Order;
import tu.kielce.booksstore.payment.domain.dto.PaymentGatewayAuth;

public interface PaymentGateway {
    public PaymentGatewayAuth authenticate();
    public PayuPaymentResponse createPayment(Order order, String accessToken);
    public PayuCheckPaymentResponse checkPayment(Order order, String accessToken);
}
