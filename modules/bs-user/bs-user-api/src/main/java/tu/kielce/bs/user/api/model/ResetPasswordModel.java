package tu.kielce.bs.user.api.model;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class ResetPasswordModel {
    @NotNull
    private String code;

    @NotNull
    private String password;
}
