package tu.kielce.booksstore.shelf.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BookShelfRepository extends JpaRepository<BookShelf, UUID> {
    Optional<BookShelf> findByBookIsbnAndShelf(String bookIsbn, Shelf shelf);
}
