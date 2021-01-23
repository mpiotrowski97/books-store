package tu.kielce.booksstore.user.presentation.web.model;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class UserModel {
    private final UUID id;
    private final String username;
    private final String email;
    private final String[] roles;
    private final boolean enabled;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String city;
    private final String postcode;
    private final String street;
    private final String houseNumber;
    private final String province;
    private final String country;
}
