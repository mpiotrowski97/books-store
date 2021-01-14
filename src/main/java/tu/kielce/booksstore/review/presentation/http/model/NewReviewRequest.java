package tu.kielce.booksstore.review.presentation.http.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class NewReviewRequest {
    @NotNull
    private String content;

    @NotNull
    private String bookIsbn;
}
