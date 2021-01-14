package tu.kielce.booksstore.review.application;

import org.springframework.stereotype.Component;
import tu.kielce.booksstore.review.domain.Review;
import tu.kielce.booksstore.review.presentation.http.model.ReviewDto;

import java.time.format.DateTimeFormatter;

@Component
public class ReviewMapper {
    public ReviewDto mapToDto(Review review) {
        return ReviewDto
                .builder()
                .id(review.getId())
                .author(review.getAuthor())
                .content(review.getContent())
                .createdAt(review.getCreatedAt().format(DateTimeFormatter.ISO_LOCAL_DATE))
                .isSpoiler(review.isSpoiler())
                .build();
    }
}
