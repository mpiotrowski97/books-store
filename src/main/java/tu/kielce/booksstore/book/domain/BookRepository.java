package tu.kielce.booksstore.book.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, String>, JpaSpecificationExecutor<Book> {
    Optional<Book> findByIsbn(String isbn);

    @Query(
            value = "SELECT * FROM books_store.books WHERE isbn IN (SELECT book_isbn FROM book_shelf WHERE shelf_id = ?1)",
            countQuery = "SELECT COUNT(*) FROM books_store.books WHERE isbn IN (SELECT book_isbn FROM book_shelf WHERE shelf_id = ?1)",
            nativeQuery = true
    )
    Page<Book> findAllByShelfId(UUID shelfId, Pageable pageable);
}
