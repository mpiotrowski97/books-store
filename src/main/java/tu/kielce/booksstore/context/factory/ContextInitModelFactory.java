package tu.kielce.booksstore.context.factory;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import tu.kielce.booksstore.books.domain.Category;
import tu.kielce.booksstore.context.web.model.ContextInitModel;
import tu.kielce.booksstore.security.domain.SecurityUserDetails;
import tu.kielce.booksstore.security.web.model.AuthUserModel;

import java.security.Principal;
import java.util.Collection;

@Component
public class ContextInitModelFactory {
    public ContextInitModel create(Principal principal, Collection<Category> categories) {
        SecurityUserDetails securityUserDetails = (SecurityUserDetails) ((Authentication) principal).getPrincipal();
        AuthUserModel userModel = AuthUserModel
                .builder()
                .username(securityUserDetails.getUsername())
                .email(securityUserDetails.getEmail())
                .roles(securityUserDetails.getAuthorities().stream().map(Object::toString).toArray(String[]::new))
                .build();

        return ContextInitModel.builder()
                .categories(categories)
                .authUserModel(userModel)
                .build();
    }
}
