package tu.kielce.booksstore.review.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ReviewRepository extends JpaRepository<Review, UUID> {
    List<Review> findAllByBookIsbnOrderByCreatedAtDesc(String bookIsbn);
}
