package tu.kielce.booksstore.cart.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CartItemRepository extends JpaRepository<CartItem, UUID> {
    Optional<CartItem> findByBookIsbnAndUserId(String bookIsbn, UUID userId);
}
