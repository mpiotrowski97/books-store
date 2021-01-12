package tu.kielce.booksstore.order.presentation.http;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tu.kielce.booksstore.order.presentation.http.model.request.NewOrderModel;
import tu.kielce.booksstore.order.presentation.http.model.response.NewOrderResponse;
import tu.kielce.booksstore.order.application.services.OrderService;
import tu.kielce.booksstore.order.presentation.http.model.response.OrderHistoryModel;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrdersController {
    private final OrderService orderService;

    @PostMapping("")
    public ResponseEntity<NewOrderResponse> createOrder(@RequestBody @Valid NewOrderModel newOrderModel) {
        return ResponseEntity.ok(orderService.createOrder(newOrderModel));
    }

    @RequestMapping("/user")
    public ResponseEntity<List<OrderHistoryModel>> userOrders() {
        return ResponseEntity.ok(orderService.currentUserOrders());
    }

    @PostMapping("/notify")
    public ResponseEntity<Void> changeOrderStatus() {
        return ResponseEntity.ok().build();
    }
}
