package tu.kielce.booksstore.security.web.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@NoArgsConstructor
@Getter
public class VerificationModel {
    @NotNull
    private String code;
}
