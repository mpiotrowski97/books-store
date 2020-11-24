package tu.kielce.booksstore.security.web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tu.kielce.booksstore.books.domain.Category;
import tu.kielce.booksstore.books.domain.CategoryRepository;
import tu.kielce.booksstore.security.mappers.PrincipalToLoginModelMapper;
import tu.kielce.booksstore.security.services.AuthService;
import tu.kielce.booksstore.security.web.exceptions.UserDataForbidden;
import tu.kielce.booksstore.security.web.model.*;
import tu.kielce.booksstore.users.exceptions.UserExistsException;

import javax.validation.Valid;
import java.security.Principal;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("auth")
public class SecurityController {
    private final AuthService authService;
    private final PrincipalToLoginModelMapper loginModelMapper;

    @GetMapping("login")
    public ResponseEntity<LoginModel> user(Principal principal) {
        return ResponseEntity
                .status(200)
                .body(
                        Optional.ofNullable(principal)
                                .map(loginModelMapper::map)
                                .orElse(LoginModel.builder().build())
                );
    }

    @PostMapping("register")
    public ResponseEntity<Void> register(@RequestBody @Valid RegisterModel registerModel) {
        try {
            authService.register(registerModel);
        } catch (UserExistsException e) {
            throw new UserDataForbidden();
        }

        return ResponseEntity.status(202).build();
    }

    @PostMapping("forbidden-password")
    public ResponseEntity<Void> forbiddenPassword(@RequestBody @Valid ForbiddenPasswordModel forbiddenPasswordModel) {
        authService.forbiddenPassword(forbiddenPasswordModel);
        return ResponseEntity.status(200).build();
    }

    @PostMapping("reset-password")
    public ResponseEntity<Void> resetPassword(@RequestBody @Valid ResetPasswordModel resetPasswordModel) {
        authService.resetUserPassword(resetPasswordModel);
        return ResponseEntity.status(200).build();
    }

    @PostMapping("user-verification")
    public ResponseEntity<Void> verification(@RequestBody @Valid VerificationModel verificationModel) {
        authService.verifyUser(verificationModel);
        return ResponseEntity.status(200).build();
    }
}
