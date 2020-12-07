package tu.kielce.booksstore.context.web.model;

import lombok.Builder;
import lombok.Getter;
import tu.kielce.booksstore.books.domain.Category;
import tu.kielce.booksstore.user.api.web.model.AuthUserModel;
import tu.kielce.booksstore.user.domain.dto.CurrentLoggedUser;

import java.util.Collection;

@Getter
@Builder
public class ContextInitModel {
    private final CurrentLoggedUser currentLoggedUser;
    private final Collection<Category> categories;
}
