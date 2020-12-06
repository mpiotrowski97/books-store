package tu.kielce.booksstore.users.web.model;

import lombok.Builder;
import lombok.Getter;
import tu.kielce.booksstore.users.domain.UserType;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Arrays;

@Builder
@Getter
public class UserCreateModel {
    @NotNull
    @Email
    private final String email;

    @NotNull
    private final String username;

    @NotNull
    private final String password;

    @NotNull
    private final String[] roles;

    @NotNull
    private final boolean enabled;

    @NotNull
    private final String firstName;

    @NotNull
    private final String lastName;

    @NotNull
    private final String phoneNumber;

    private final String city;

    private final String postcode;

    private final String street;

    private final String houseNumber;

    private final String province;

    private final String country;

    public UserType[] getUserTypes() {
        return Arrays.stream(roles).map(UserType::valueOf).toArray(UserType[]::new);
    }
}
