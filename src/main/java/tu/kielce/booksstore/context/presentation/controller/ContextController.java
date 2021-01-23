package tu.kielce.booksstore.context.presentation.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tu.kielce.booksstore.book.domain.Category;
import tu.kielce.booksstore.book.domain.CategoryRepository;
import tu.kielce.booksstore.context.application.factory.ContextInitModelFactory;
import tu.kielce.booksstore.context.presentation.model.ContextInitModel;
import tu.kielce.booksstore.user.application.services.SecurityUserService;

import java.security.Principal;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("context")
@RequiredArgsConstructor
public class ContextController {
    private final CategoryRepository categoryRepository;
    private final ContextInitModelFactory contextInitModelFactory;
    private final SecurityUserService securityUserService;

    @GetMapping("init")
    public ResponseEntity<ContextInitModel> appInit(Principal principal) {
        Collection<Category> categories = categoryRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));

        return ResponseEntity
                .status(200)
                .body(
                        Optional.ofNullable(principal)
                                .map(user -> contextInitModelFactory.create(securityUserService.getCurrentLoggedUser(), categories))
                                .orElse(ContextInitModel.builder().categories(categories).build())
                );
    }
}
