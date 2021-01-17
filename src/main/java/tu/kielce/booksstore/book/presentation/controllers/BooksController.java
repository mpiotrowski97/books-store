package tu.kielce.booksstore.book.presentation.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tu.kielce.booksstore.book.application.services.BooksService;
import tu.kielce.booksstore.book.domain.BookRepository;
import tu.kielce.booksstore.book.application.mappers.BookToBookModelMapper;
import tu.kielce.booksstore.book.presentation.exceptions.BookNotFoundException;
import tu.kielce.booksstore.book.presentation.model.BookModel;

import static tu.kielce.booksstore.book.application.specification.BookSpecifications.category;
import static tu.kielce.booksstore.book.application.specification.BookSpecifications.searchCriteria;

@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class BooksController {
    private final BookRepository bookRepository;
    private final BookToBookModelMapper bookToBookModelMapper;
    private final BooksService booksService;

    @GetMapping("")
    public ResponseEntity<Page<BookModel>> list(
            Pageable pageable,
            @RequestParam(defaultValue = "") String category
    ) {
        return ResponseEntity
                .status(200)
                .body(bookRepository.findAll(category(category), pageable).map(bookToBookModelMapper::map));
    }

    @GetMapping("search")
    public ResponseEntity<Page<BookModel>> search(
            Pageable pageable,
            @RequestParam(defaultValue = "", name = "search") String query
    ) {
        return ResponseEntity
                .status(200)
                .body(bookRepository.findAll(searchCriteria(query), pageable).map(bookToBookModelMapper::map));
    }

    @GetMapping("{isbn}")
    public ResponseEntity<BookModel> getOne(@PathVariable String isbn) {
        return ResponseEntity
                .status(200)
                .body(
                        booksService
                                .getByIsbn(isbn)
                                .map(bookToBookModelMapper::map)
                                .orElseThrow(BookNotFoundException::new)
                );
    }
}
