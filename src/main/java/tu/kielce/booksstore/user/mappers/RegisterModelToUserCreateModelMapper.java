package tu.kielce.booksstore.user.mappers;

import org.springframework.stereotype.Component;
import tu.kielce.booksstore.user.api.web.model.RegisterModel;
import tu.kielce.booksstore.user.domain.UserType;
import tu.kielce.booksstore.user.api.web.model.UserCreateModel;

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
                .firstName(registerModel.getFirstName())
                .phoneNumber(registerModel.getPhoneNumber())
                .lastName(registerModel.getLastName())
                .city(registerModel.getCity())
                .street(registerModel.getStreet())
                .postcode(registerModel.getPostcode())
                .houseNumber(registerModel.getHouseNumber())
                .province(registerModel.getProvince())
                .country(registerModel.getCountry())
                .build();
    }
}
