package tu.kielce.booksstore.shelf.presentation.model;

import lombok.Data;

import java.util.UUID;

@Data
public class AddBookToShelfRequest {
    private String bookIsbn;
    private UUID shelfId;
}
