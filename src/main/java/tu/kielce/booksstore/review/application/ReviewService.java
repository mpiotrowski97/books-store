package tu.kielce.booksstore.review.application;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;
import tu.kielce.booksstore.book.application.services.BookDoesNotExist;
import tu.kielce.booksstore.book.application.services.BooksService;
import tu.kielce.booksstore.review.domain.Review;
import tu.kielce.booksstore.review.domain.ReviewRepository;
import tu.kielce.booksstore.review.presentation.http.model.NewReviewRequest;
import tu.kielce.booksstore.review.presentation.http.model.ReviewDto;
import tu.kielce.booksstore.user.application.services.SecurityUserService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final BooksService booksService;
    private final SecurityUserService securityUserService;
    private final ReviewMapper reviewMapper;

    public ReviewDto createReview(NewReviewRequest newReviewRequest) {
        val book = booksService.getByIsbn(newReviewRequest.getBookIsbn()).orElseThrow(BookDoesNotExist::new);
        val currentLoggedUser = securityUserService.getCurrentLoggedUser();

        val review = reviewRepository.save(Review
                .builder()
                .content(newReviewRequest.getContent())
                .createdAt(LocalDateTime.now())
                .bookIsbn(book.getIsbn())
                .author(currentLoggedUser.getFirstName() + " " + currentLoggedUser.getLastName())
                .isSpoiler(false)
                .build());

        return reviewMapper.mapToDto(review);
    }

    public List<ReviewDto> getReviewsForBook(String bookIsbn) {
        val book = booksService.getByIsbn(bookIsbn).orElseThrow(BookDoesNotExist::new);

        return reviewRepository
                .findAllByBookIsbnOrderByCreatedAtDesc(book.getIsbn())
                .stream()
                .map(reviewMapper::mapToDto)
                .collect(Collectors.toList());
    }

    public void deleteReview(UUID id) {
        reviewRepository.delete(reviewRepository.findById(id).orElseThrow(ReviewDoesNotExistException::new));
    }

    public void markAsSpoiler(UUID id) {
        val review = reviewRepository.findById(id).orElseThrow(ReviewDoesNotExistException::new);

        review.markAsSpoiler();

        reviewRepository.save(review);
    }
}
