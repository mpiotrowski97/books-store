package tu.kielce.booksstore.order.application.services;

import org.springframework.stereotype.Service;
import tu.kielce.booksstore.order.api.web.model.request.CreateOrderModel;

import javax.transaction.Transactional;

@Service
public class OrderService {
    @Transactional
    public void createOrder(CreateOrderModel createOrderModel) {

    }
}
