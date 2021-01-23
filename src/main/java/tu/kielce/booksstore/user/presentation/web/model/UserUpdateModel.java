package tu.kielce.booksstore.user.presentation.web.model;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Builder
public class UserUpdateModel {
    @NotNull
    @Email
    private final String email;

    @NotNull
    private final String username;

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
}
