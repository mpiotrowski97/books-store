package tu.kielce.booksstore.users.mappers;

import org.springframework.stereotype.Component;
import tu.kielce.booksstore.users.domain.User;
import tu.kielce.booksstore.users.web.model.UserModel;

@Component
public class UserToUserModelMapper {
    public UserModel map(User user) {
        return UserModel
                .builder()
                .username(user.getUsername())
                .email(user.getEmail())
                .id(user.getId())
                .roles(user.getRoles())
                .build();
    }
}
