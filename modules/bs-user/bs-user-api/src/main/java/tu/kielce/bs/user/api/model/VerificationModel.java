package tu.kielce.bs.user.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
public class VerificationModel {
    @NotNull
    private String code;
}
