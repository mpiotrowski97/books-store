package tu.kielce.booksstore.cart.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tu.kielce.booksstore.cart.api.model.ChangeQuantityModel;
import tu.kielce.booksstore.cart.application.services.CartService;
import tu.kielce.booksstore.cart.api.model.AddCartItemModel;
import tu.kielce.booksstore.cart.domain.dto.SummaryDto;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @PostMapping("/add")
    public ResponseEntity<Void> addItem(@RequestBody @Valid AddCartItemModel addCartItemModel) {
        cartService.addToCart(addCartItemModel);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/summary")
    public ResponseEntity<SummaryDto> summary() {
        return ResponseEntity.ok(cartService.createCartSummary());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeCartItem(@PathVariable UUID id) {
        cartService.removeCartItem(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/clear")
    public ResponseEntity<Void> clearCart() {
        cartService.clearUserCart();
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}/change-quantity")
    public ResponseEntity<Void> changeQuantity(
            @PathVariable UUID id,
            @RequestBody @Valid ChangeQuantityModel changeQuantityModel
    ) {
        cartService.changeQuantity(id, changeQuantityModel.getQuantity());
        return ResponseEntity.noContent().build();
    }
}
