package tu.kielce.booksstore.books.web.controllers;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tu.kielce.booksstore.books.domain.BookRepository;
import tu.kielce.booksstore.books.mappers.BookToBookModelMapper;
import tu.kielce.booksstore.books.web.model.BookModel;

import static tu.kielce.booksstore.books.specification.BookSpecifications.bookTitle;
import static tu.kielce.booksstore.books.specification.BookSpecifications.category;

@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class BooksController {
    private final BookRepository bookRepository;
    private final BookToBookModelMapper bookToBookModelMapper;

    @GetMapping("")
    public ResponseEntity<Page<BookModel>> list(
            Pageable pageable,
            @RequestParam(defaultValue = "") String category
    ) {
        return ResponseEntity
                .status(200)
                .body(bookRepository.findAll(category(category), pageable).map(bookToBookModelMapper::map));
    }
}
