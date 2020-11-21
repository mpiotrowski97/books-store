package tu.kielce.booksstore.security.mappers;

import org.springframework.stereotype.Component;
import tu.kielce.booksstore.security.web.model.RegisterModel;
import tu.kielce.booksstore.users.domain.UserType;
import tu.kielce.booksstore.users.web.model.UserCreateModel;

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
