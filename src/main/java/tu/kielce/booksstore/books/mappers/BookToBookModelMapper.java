package tu.kielce.booksstore.books.mappers;

import org.springframework.stereotype.Component;
import tu.kielce.booksstore.books.domain.Book;
import tu.kielce.booksstore.books.web.model.BookModel;

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
                .build();
    }
}
