package tu.kielce.booksstore.context.presentation.model;

import lombok.Builder;
import lombok.Getter;
import tu.kielce.booksstore.book.domain.Category;
import tu.kielce.booksstore.user.domain.dto.CurrentLoggedUser;

import java.util.Collection;

@Getter
@Builder
public class ContextInitModel {
    private final CurrentLoggedUser currentLoggedUser;
    private final Collection<Category> categories;
}
