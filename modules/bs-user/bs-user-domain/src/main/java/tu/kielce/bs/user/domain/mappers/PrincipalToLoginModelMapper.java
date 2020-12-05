package tu.kielce.bs.user.domain.mappers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import tu.kielce.bs.users.domain.SecurityUserDetails;
import tu.kielce.bs.user.api.model.AuthUserModel;
import tu.kielce.bs.user.api.model.LoginModel;

import java.security.Principal;

@Component
public class PrincipalToLoginModelMapper {
    public LoginModel map(Principal principal) {
        SecurityUserDetails securityUserDetails = (SecurityUserDetails) ((Authentication) principal).getPrincipal();
        AuthUserModel userModel = AuthUserModel
                .builder()
                .username(securityUserDetails.getUsername())
                .email(securityUserDetails.getEmail())
                .roles(securityUserDetails.getAuthorities().stream().map(Object::toString).toArray(String[]::new))
                .build();

        return LoginModel.builder().user(userModel).build();
    }
}
