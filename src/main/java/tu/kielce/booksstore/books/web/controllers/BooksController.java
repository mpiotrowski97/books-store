package tu.kielce.booksstore.books.web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tu.kielce.booksstore.books.domain.BookRepository;
import tu.kielce.booksstore.books.mappers.BookToBookModelMapper;
import tu.kielce.booksstore.books.web.model.BookModel;

@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class BooksController {
    private final BookRepository bookRepository;
    private final BookToBookModelMapper bookToBookModelMapper;

    @GetMapping("")
    public ResponseEntity<Page<BookModel>> list(Pageable pageable) {
        return ResponseEntity
                .status(200)
                .body(bookRepository.findAll(pageable).map(bookToBookModelMapper::map));
    }
}
