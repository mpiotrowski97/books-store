package tu.kielce.booksstore.context.web.model;

import lombok.Builder;
import lombok.Getter;
import tu.kielce.booksstore.books.domain.Category;
import tu.kielce.booksstore.users.web.model.AuthUserModel;

import java.util.Collection;

@Getter
@Builder
public class ContextInitModel {
    private final AuthUserModel authUserModel;
    private final Collection<Category> categories;
}
