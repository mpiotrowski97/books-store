package tu.kielce.booksstore.security.web.models;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class UserDto {
    @NotNull
    @Email
    private String email;

    @NotNull
    private String username;

    @NotNull
    private String password;
}
