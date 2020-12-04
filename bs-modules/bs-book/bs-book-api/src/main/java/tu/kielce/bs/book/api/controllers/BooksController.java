package tu.kielce.bs.book.api.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tu.kielce.bs.book.domain.BookRepository;
import tu.kielce.bs.book.domain.dto.BookDto;

import static tu.kielce.bs.book.domain.BookSpecifications.category;


@RestController
@RequestMapping("books")
@RequiredArgsConstructor
class BooksController {
    private final BookRepository bookRepository;

    @GetMapping("")
    public ResponseEntity<Page<BookDto>> list(
            Pageable pageable,
            @RequestParam(defaultValue = "") String category
    ) {
        return ResponseEntity
                .status(200)
                .body(bookRepository.findAll(category(category), pageable).map(book -> BookDto.builder().build()));
    }
}
