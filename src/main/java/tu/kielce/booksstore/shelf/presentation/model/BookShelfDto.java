package tu.kielce.booksstore.shelf.presentation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookShelfDto {
    private UUID id;
    private String bookIsbn;
    private UUID shelfId;
}
