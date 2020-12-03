package tu.kielce.bs.users.mappers;

import org.springframework.stereotype.Component;
import tu.kielce.bs.users.domain.User;
import tu.kielce.bs.users.web.model.UserModel;

@Component
public class UserToUserModelMapper {
    public UserModel map(User user) {
        return UserModel
                .builder()
                .username(user.getUsername())
                .email(user.getEmail())
                .enabled(user.isEnabled())
                .id(user.getId())
                .roles(user.getRoles())
                .build();
    }
}
