package tu.kielce.booksstore.book.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, String>, JpaSpecificationExecutor<Book> {
    Optional<Book> findByIsbn(String isbn);
}
