package tu.kielce.booksstore.order.api.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tu.kielce.booksstore.order.api.web.model.request.CreateOrderModel;
import tu.kielce.booksstore.order.api.web.model.response.CreateOrderResponse;
import tu.kielce.booksstore.order.application.services.OrderService;

import javax.validation.Valid;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrdersController {
    private final OrderService orderService;

    @PostMapping("")
    public ResponseEntity<CreateOrderResponse> createOrder(@RequestBody @Valid CreateOrderModel createOrderModel) {
        orderService.createOrder(createOrderModel);
        return ResponseEntity.ok(CreateOrderResponse.builder().build());
    }
}
