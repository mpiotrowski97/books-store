package tu.kielce.booksstore.book.application.services;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.book.application.mappers.BookToBookModelMapper;
import tu.kielce.booksstore.book.domain.Book;
import tu.kielce.booksstore.book.domain.BookRepository;
import tu.kielce.booksstore.book.domain.CategoryRepository;
import tu.kielce.booksstore.book.presentation.exceptions.BookAlreadyExistsException;
import tu.kielce.booksstore.book.presentation.exceptions.CategoryNotFoundException;
import tu.kielce.booksstore.book.presentation.model.BookModel;
import tu.kielce.booksstore.book.presentation.model.CreateBookModel;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BooksService {
    private final BookRepository bookRepository;
    private final BookToBookModelMapper mapper;
    private final CategoryRepository categoryRepository;

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

    public void deleteBook(final String isbn) {
        bookRepository.delete(bookRepository.findByIsbn(isbn).orElseThrow(BookDoesNotExist::new));
    }

    public void createBook(CreateBookModel createBookModel) {
        val category = categoryRepository.findById(createBookModel.getCategory())
                .orElseThrow(CategoryNotFoundException::new);

        if (bookRepository.findById(createBookModel.getIsbn()).isPresent()) {
            throw new BookAlreadyExistsException();
        }

        bookRepository.save(Book
                .builder()
                .isbn(createBookModel.getIsbn())
                .author(createBookModel.getAuthor())
                .category(category)
                .description(createBookModel.getDescription())
                .price(createBookModel.getPrice())
                .quantity(createBookModel.getQuantity())
                .publishedBy(createBookModel.getPublishedBy())
                .title(createBookModel.getTitle())
                .build()
        );
    }
}
