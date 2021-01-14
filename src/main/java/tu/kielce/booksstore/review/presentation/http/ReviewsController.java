package tu.kielce.booksstore.review.presentation.http;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tu.kielce.booksstore.review.application.ReviewService;
import tu.kielce.booksstore.review.presentation.http.model.NewReviewRequest;
import tu.kielce.booksstore.review.presentation.http.model.ReviewDto;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewsController {

    private final ReviewService reviewService;

    @PostMapping("")
    public ResponseEntity<ReviewDto> create(@RequestBody @Valid NewReviewRequest newReviewRequest) {
        return ResponseEntity.ok(reviewService.createReview(newReviewRequest));
    }

    @GetMapping("/{bookIsbn}")
    public ResponseEntity<List<ReviewDto>> booksReview(@PathVariable String bookIsbn) {
        return ResponseEntity.ok(reviewService.getReviewsForBook(bookIsbn));
    }
}
