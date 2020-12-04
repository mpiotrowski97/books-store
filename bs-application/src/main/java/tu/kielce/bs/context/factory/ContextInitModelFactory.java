package tu.kielce.bs.context.factory;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import tu.kielce.bs.context.web.model.ContextInitModel;
import tu.kielce.bs.users.domain.SecurityUserDetails;
import tu.kielce.bs.users.web.model.AuthUserModel;

import java.security.Principal;
import java.util.Collection;

@Component
public class ContextInitModelFactory {
    public ContextInitModel create(Principal principal) {
        SecurityUserDetails securityUserDetails = (SecurityUserDetails) ((Authentication) principal).getPrincipal();
        AuthUserModel userModel = AuthUserModel
                .builder()
                .username(securityUserDetails.getUsername())
                .email(securityUserDetails.getEmail())
                .roles(securityUserDetails.getAuthorities().stream().map(Object::toString).toArray(String[]::new))
                .build();

        return ContextInitModel.builder()
                .authUserModel(userModel)
                .build();
    }
}
