package tu.kielce.booksstore.shelf.application;

import org.springframework.stereotype.Component;
import tu.kielce.booksstore.shelf.domain.Shelf;
import tu.kielce.booksstore.shelf.presentation.model.ShelfDto;

@Component
public class ShelvesMapper {
    public ShelfDto mapToDto(Shelf shelf) {
        return ShelfDto
                .builder()
                .id(shelf.getId())
                .name(shelf.getName())
                .booksQuantity(shelf.getBooks().size())
                .build();
    }
}
