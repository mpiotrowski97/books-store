package tu.kielce.booksstore.cart.application.services;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.book.application.services.BookDoesNotExist;
import tu.kielce.booksstore.book.application.services.BooksService;
import tu.kielce.booksstore.cart.api.exception.CartItemNotFoundException;
import tu.kielce.booksstore.cart.application.exceptions.BookOutOfStockException;
import tu.kielce.booksstore.cart.domain.CartItem;
import tu.kielce.booksstore.cart.domain.CartItemRepository;
import tu.kielce.booksstore.cart.api.model.AddCartItemModel;
import tu.kielce.booksstore.cart.domain.dto.SummaryDto;
import tu.kielce.booksstore.user.domain.SecurityUserDetails;
import tu.kielce.booksstore.user.services.SecurityUserService;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartItemRepository cartItemRepository;
    private final SecurityUserService securityUserService;
    private final BooksService booksService;

    public void addToCart(AddCartItemModel addCartItemModel) {
        val book = booksService.getByIsbn(addCartItemModel.getBookIsbn()).orElseThrow(BookDoesNotExist::new);
        val user = (SecurityUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        CartItem cartItem = cartItemRepository.findByBookIsbnAndUserId(addCartItemModel.getBookIsbn(), user.getId())
                .map(item -> {
                    int newQuantity = item.getQuantity() + 1;

                    if (book.hasQuantity(newQuantity)) {
                        throw new BookOutOfStockException();
                    }

                    item.addQuantity(1);
                    return item;
                })
                .orElse(CartItem.builder().bookIsbn(addCartItemModel.getBookIsbn()).quantity(1).userId(user.getId()).build());

        cartItemRepository.save(cartItem);
    }

    public SummaryDto createCartSummary() {
        val user = (SecurityUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return new SummaryDto(cartItemRepository.findAllForSummary(user.getId()));
    }

    @Transactional
    public void clearUserCart() {
        val currentLoggedUser = securityUserService.getCurrentLoggedUser();
        cartItemRepository.deleteAllByUserId(currentLoggedUser.getId());
    }

    @Transactional
    public void removeCartItem(UUID cartItemId) {
        val currentLoggedUser = securityUserService.getCurrentLoggedUser();
        cartItemRepository.deleteByIdAndUserId(cartItemId, currentLoggedUser.getId());
    }

    @Transactional
    public void changeQuantity(UUID id, int quantity) {
        val currentLoggedUser = securityUserService.getCurrentLoggedUser();

        val cartItem = cartItemRepository.findByIdAndUserId(id, currentLoggedUser.getId())
                .orElseThrow(CartItemNotFoundException::new);

        val book = booksService.getByIsbn(cartItem.getBookIsbn()).orElseThrow(BookDoesNotExist::new);

        if (quantity > book.getQuantity()) {
            throw new BookOutOfStockException();
        }

        cartItem.changeQuantity(quantity);

        cartItemRepository.save(cartItem);
    }
}
