package tu.kielce.booksstore.user.application;

import org.springframework.stereotype.Component;
import tu.kielce.booksstore.user.domain.User;
import tu.kielce.booksstore.user.domain.dto.CurrentLoggedUser;

@Component
public class UserMapper {
    public CurrentLoggedUser mapToCurrentLoggedUser(User user) {
        return CurrentLoggedUser
                .builder()
                .email(user.getEmail())
                .username(user.getUsername())
                .roles(user.getRoles())
                .street(user.getStreet())
                .houseNumber(user.getHouseNumber())
                .city(user.getCity())
                .postcode(user.getPostcode())
                .province(user.getProvince())
                .country(user.getCountry())
                .phoneNumber(user.getPhoneNumber())
                .build();
    }
}
