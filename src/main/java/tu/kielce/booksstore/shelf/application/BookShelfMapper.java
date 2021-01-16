package tu.kielce.booksstore.shelf.application;

import org.springframework.stereotype.Component;
import tu.kielce.booksstore.shelf.domain.BookShelf;
import tu.kielce.booksstore.shelf.presentation.model.BookShelfDto;

@Component
public class BookShelfMapper {
    public BookShelfDto mapToDto(BookShelf bookShelf) {
        return BookShelfDto
                .builder()
                .id(bookShelf.getId())
                .shelfId(bookShelf.getShelf().getId())
                .bookIsbn(bookShelf.getBookIsbn())
                .build();
    }
}
