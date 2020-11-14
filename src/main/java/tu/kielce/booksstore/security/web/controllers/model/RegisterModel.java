package tu.kielce.booksstore.security.web.controllers.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class RegisterModel {
    @NotNull
    @Email
    private String email;

    @NotNull
    private String username;

    @NotNull
    private String password;
}
