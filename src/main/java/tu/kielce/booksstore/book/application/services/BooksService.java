package tu.kielce.booksstore.book.application.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.book.domain.Book;
import tu.kielce.booksstore.book.domain.BookRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BooksService {
    private final BookRepository bookRepository;

    public Optional<Book> getByIsbn(String bookIsbn) {
        return bookRepository.findByIsbn(bookIsbn);
    }
}