package tu.kielce.bs.context.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tu.kielce.bs.context.factory.ContextInitModelFactory;
import tu.kielce.bs.context.web.model.ContextInitModel;

import java.security.Principal;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("context")
@RequiredArgsConstructor
public class ContextController {
    private final ContextInitModelFactory contextInitModelFactory;

    @GetMapping("init")
    public ResponseEntity<ContextInitModel> appInit(Principal principal) {

        return ResponseEntity
                .status(200)
                .body(
                        Optional.ofNullable(principal)
                                .map(user -> contextInitModelFactory.create(user))
                                .orElse(ContextInitModel.builder().build())
                );
    }
}
