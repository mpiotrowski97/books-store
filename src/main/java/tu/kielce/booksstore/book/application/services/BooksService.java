package tu.kielce.booksstore.book.application.services;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.book.application.mappers.BookToBookModelMapper;
import tu.kielce.booksstore.book.domain.Book;
import tu.kielce.booksstore.book.domain.BookRepository;
import tu.kielce.booksstore.book.presentation.model.BookModel;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BooksService {
    private final BookRepository bookRepository;
    private final BookToBookModelMapper mapper;

    public Optional<Book> getByIsbn(String bookIsbn) {
        return bookRepository.findByIsbn(bookIsbn);
    }

    public void changeBookQuantity(String bookIsbn, int quantity) {
        val book = bookRepository.findByIsbn(bookIsbn).orElseThrow(BookDoesNotExist::new);

        book.setQuantity(quantity);

        bookRepository.save(book);
    }

    public Page<BookModel> getBooksOnShelf(UUID shelfId, Pageable pageable) {
        return bookRepository.findAllByShelfId(shelfId, pageable).map(mapper::map);
    }
}
