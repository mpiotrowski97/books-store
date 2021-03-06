package tu.kielce.booksstore.user.presentation.web.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class ForbiddenPasswordModel {
    @NotNull
    @Email
    private String email;
}
