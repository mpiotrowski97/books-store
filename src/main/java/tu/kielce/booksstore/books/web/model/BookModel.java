package tu.kielce.booksstore.books.web.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BookModel {
    private final String isbn;
    private final String author;
    private final String publishedBy;
    private final String title;
    private final String category;
    private final String description;
}
