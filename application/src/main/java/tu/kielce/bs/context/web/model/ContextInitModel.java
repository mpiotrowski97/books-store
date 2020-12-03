package tu.kielce.bs.context.web.model;

import lombok.Builder;
import lombok.Getter;
import tu.kielce.bs.users.web.model.AuthUserModel;

import java.util.Collection;

@Getter
@Builder
public class ContextInitModel {
    private final AuthUserModel authUserModel;
}
