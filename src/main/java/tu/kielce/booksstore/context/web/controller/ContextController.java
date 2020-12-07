package tu.kielce.booksstore.context.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tu.kielce.booksstore.books.domain.Category;
import tu.kielce.booksstore.books.domain.CategoryRepository;
import tu.kielce.booksstore.context.factory.ContextInitModelFactory;
import tu.kielce.booksstore.context.web.model.ContextInitModel;
import tu.kielce.booksstore.user.api.facade.UserFacade;

import java.security.Principal;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("context")
@RequiredArgsConstructor
public class ContextController {
    private final CategoryRepository categoryRepository;
    private final ContextInitModelFactory contextInitModelFactory;
    private final UserFacade userFacade;

    @GetMapping("init")
    public ResponseEntity<ContextInitModel> appInit(Principal principal) {
        Collection<Category> categories = categoryRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));

        return ResponseEntity
                .status(200)
                .body(
                        Optional.ofNullable(principal)
                                .map(user -> contextInitModelFactory.create(userFacade.getCurrentLoggedUser(), categories))
                                .orElse(ContextInitModel.builder().categories(categories).build())
                );
    }
}
