package tu.kielce.booksstore.user.presentation.web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tu.kielce.booksstore.user.application.services.AuthService;
import tu.kielce.booksstore.user.presentation.web.exceptions.UserDataForbidden;
import tu.kielce.booksstore.user.presentation.web.model.*;
import tu.kielce.booksstore.user.application.exceptions.UserExistsException;
import tu.kielce.booksstore.user.application.services.SecurityUserService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("auth")
public class SecurityController {
    private final AuthService authService;
    private final SecurityUserService securityUserService;

    @GetMapping("login")
    public ResponseEntity<LoginModel> user() {
        return ResponseEntity
                .status(200)
                .body(
                        LoginModel.builder().user(securityUserService.getCurrentLoggedUser()).build()
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
