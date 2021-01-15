package tu.kielce.booksstore.shelf.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tu.kielce.booksstore.shelf.application.ShelvesService;
import tu.kielce.booksstore.shelf.presentation.model.CreateShelfRequest;
import tu.kielce.booksstore.shelf.presentation.model.ShelfDto;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/shelves")
@RequiredArgsConstructor
public class ShelvesController {

    private final ShelvesService shelvesService;

    @GetMapping("")
    public ResponseEntity<Collection<ShelfDto>> getList() {
        return ResponseEntity.ok(shelvesService.currentUserShelves());
    }

    @PostMapping("")
    public ResponseEntity<ShelfDto> create(@RequestBody @Valid CreateShelfRequest createShelfRequest) {
        return ResponseEntity.ok(shelvesService.createShelf(createShelfRequest));
    }
}
