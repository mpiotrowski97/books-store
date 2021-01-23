package tu.kielce.booksstore.user.presentation.web.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AuthUserModel {
    private final String email;
    private final String username;
    private final String[] roles;
    private final String street;
    private final String houseNumber;
    private final String city;
    private final String postcode;
    private final String province;
    private final String country;
}
