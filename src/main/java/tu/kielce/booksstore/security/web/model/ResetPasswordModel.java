package tu.kielce.booksstore.security.web.model;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
public class ResetPasswordModel {
    @NotNull
    private String code;

    @NotNull
    private String password;
}
