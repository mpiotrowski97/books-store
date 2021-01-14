package tu.kielce.booksstore.review.presentation.http.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class ReviewDto {
    private final UUID id;
    private final String author;
    private final String createdAt;
    private final String content;
    private final boolean isSpoiler;
}
