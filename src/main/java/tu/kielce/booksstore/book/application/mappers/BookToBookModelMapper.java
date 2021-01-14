package tu.kielce.booksstore.book.application.mappers;

import org.springframework.stereotype.Component;
import tu.kielce.booksstore.book.domain.Book;
import tu.kielce.booksstore.book.presentation.model.BookModel;

@Component
public class BookToBookModelMapper {
    public BookModel map(Book book) {
        return BookModel
                .builder()
                .isbn(book.getIsbn())
                .title(book.getTitle())
                .description(book.getDescription())
                .author(book.getAuthor())
                .category(book.getCategory().getName())
                .publishedBy(book.getPublishedBy())
                .price(book.getPrice())
                .build();
    }
}
