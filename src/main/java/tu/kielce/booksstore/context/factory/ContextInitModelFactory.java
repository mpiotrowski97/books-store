package tu.kielce.booksstore.context.factory;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import tu.kielce.booksstore.books.domain.Category;
import tu.kielce.booksstore.context.web.model.ContextInitModel;
import tu.kielce.booksstore.user.domain.SecurityUserDetails;
import tu.kielce.booksstore.user.api.web.model.AuthUserModel;
import tu.kielce.booksstore.user.domain.dto.CurrentLoggedUser;

import java.security.Principal;
import java.util.Collection;

@Component
public class ContextInitModelFactory {
    public ContextInitModel create(CurrentLoggedUser currentLoggedUser, Collection<Category> categories) {
        return ContextInitModel.builder()
                .categories(categories)
                .currentLoggedUser(currentLoggedUser)
                .build();
    }
}
