package tu.kielce.booksstore.cart.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tu.kielce.booksstore.cart.services.CartService;
import tu.kielce.booksstore.cart.web.model.AddCartItemModel;

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
}
