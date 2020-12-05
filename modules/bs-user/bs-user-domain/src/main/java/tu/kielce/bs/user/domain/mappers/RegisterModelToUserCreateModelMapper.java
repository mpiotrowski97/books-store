package tu.kielce.bs.user.domain.mappers;

import org.springframework.stereotype.Component;
import tu.kielce.bs.user.api.model.RegisterModel;
import tu.kielce.bs.users.domain.UserType;
import tu.kielce.bs.user.api.model.UserCreateModel;

import java.util.Arrays;
import java.util.Objects;

@Component
public class RegisterModelToUserCreateModelMapper {
    public UserCreateModel map(RegisterModel registerModel, UserType[] roles, boolean enabled) {
        return UserCreateModel
                .builder()
                .email(registerModel.getEmail())
                .username(registerModel.getUsername())
                .password(registerModel.getPassword())
                .roles(Arrays.stream(roles).map(Objects::toString).toArray(String[]::new))
                .enabled(enabled)
                .build();
    }
}
