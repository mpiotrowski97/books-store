package tu.kielce.booksstore.shelf.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ShelfRepository extends JpaRepository<Shelf, UUID> {
    List<Shelf> findAllByUserIdOrderByNameAsc(UUID userId);

    Optional<Shelf> findByIdAndUserId(UUID shelfId, UUID id);
}
