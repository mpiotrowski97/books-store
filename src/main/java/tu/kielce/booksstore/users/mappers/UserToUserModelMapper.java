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
                .enabled(user.isEnabled())
                .id(user.getId())
                .roles(user.getRoles())
                .firstName(user.getFirstName())
                .phoneNumber(user.getPhoneNumber())
                .lastName(user.getLastName())
                .city(user.getCity())
                .street(user.getStreet())
                .postcode(user.getPostcode())
                .houseNumber(user.getHouseNumber())
                .province(user.getProvince())
                .country(user.getCountry())
                .build();
    }
}
