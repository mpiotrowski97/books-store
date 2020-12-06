package tu.kielce.booksstore.cart.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tu.kielce.booksstore.cart.application.services.CartService;
import tu.kielce.booksstore.cart.api.model.AddCartItemModel;
import tu.kielce.booksstore.cart.domain.dto.SummaryDto;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @PostMapping("/add")
    public ResponseEntity<Void> addItem(@RequestBody AddCartItemModel addCartItemModel) {
        cartService.addToCart(addCartItemModel);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/summary")
    public ResponseEntity<SummaryDto> summary() {
        return ResponseEntity.ok(cartService.createCartSummary());
    }
}
