package tu.kielce.booksstore.security.web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tu.kielce.booksstore.security.web.controllers.model.RegisterModel;
import tu.kielce.booksstore.users.UsersFacade;

import javax.validation.Valid;
import java.security.Principal;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
class SecurityController {
    private final UsersFacade usersFacade;

    @RequestMapping("login")
    public Principal login(Principal user) {
        return user;
    }

    @RequestMapping("register")
    public ResponseEntity<Void> register(@RequestBody @Valid RegisterModel registerModel) {
        usersFacade.createUser(registerModel.getUsername(), registerModel.getPassword(), registerModel.getEmail());

        return ResponseEntity.status(202).build();
    }
}
