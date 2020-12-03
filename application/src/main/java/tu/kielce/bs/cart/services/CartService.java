package tu.kielce.bs.cart.services;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import tu.kielce.bs.cart.domain.CartItem;
import tu.kielce.bs.cart.domain.CartItemRepository;
import tu.kielce.bs.cart.web.model.AddCartItemModel;
import tu.kielce.bs.users.domain.SecurityUserDetails;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartItemRepository cartItemRepository;

    public void addToCart(AddCartItemModel addCartItemModel) {
        val user = (SecurityUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        CartItem cartItem = cartItemRepository.findByBookIsbnAndUserId(addCartItemModel.getBookIsbn(), user.getId())
                .map(item -> {
                    item.addQuantity(1);
                    return item;
                })
                .orElse(CartItem.builder().bookIsbn(addCartItemModel.getBookIsbn()).quantity(1).userId(user.getId()).build());

        cartItemRepository.save(cartItem);
    }
}
