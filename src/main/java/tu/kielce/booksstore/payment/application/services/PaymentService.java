package tu.kielce.booksstore.payment.application.services;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.order.domain.Order;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentGateway paymentGateway;

    public void createPayment(Order order) {
        val authenticateResponse = paymentGateway.authenticate();
        paymentGateway.createPayment(order, authenticateResponse.getAccessToken());
    }
}
