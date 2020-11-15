package tu.kielce.booksstore.security.web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tu.kielce.booksstore.security.web.exceptions.UserDataForbidden;
import tu.kielce.booksstore.security.web.model.RegisterModel;
import tu.kielce.booksstore.users.UsersFacade;
import tu.kielce.booksstore.users.domain.UserType;
import tu.kielce.booksstore.users.exceptions.UserExistsException;

import javax.validation.Valid;
import java.security.Principal;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
public class SecurityController {
    private final UsersFacade usersFacade;

    @GetMapping("login")
    public Principal login(Principal user) {
        return user;
    }

    @PostMapping("register")
    public ResponseEntity<Void> register(@RequestBody @Valid RegisterModel registerModel) {
        try {
            usersFacade.createUser(
                    registerModel.getUsername(),
                    registerModel.getPassword(),
                    registerModel.getEmail(),
                    new UserType[]{UserType.ROLE_USER}
            );
        } catch (UserExistsException e) {
            throw new UserDataForbidden();
        }

        return ResponseEntity.status(202).build();
    }
}
