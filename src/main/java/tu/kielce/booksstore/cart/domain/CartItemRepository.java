package tu.kielce.booksstore.cart.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tu.kielce.booksstore.cart.domain.dto.CartItemDto;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface CartItemRepository extends JpaRepository<CartItem, UUID> {
    Optional<CartItem> findByIdAndUserId(UUID id, UUID userId);

    Optional<CartItem> findByBookIsbnAndUserId(String bookIsbn, UUID userId);

    @Query("SELECT new tu.kielce.booksstore.cart.domain.dto.CartItemDto(c.id, b.isbn, b.title, b.price, c.quantity) FROM CartItem c LEFT JOIN Book b on c.bookIsbn = b.isbn WHERE c.userId = ?1")
    Collection<CartItemDto> findAllForSummary(UUID userId);

    void deleteAllByUserId(UUID userId);

    void deleteByIdAndUserId(UUID id, UUID userId);
}
