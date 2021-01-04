package tu.kielce.booksstore.user.domain.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class CurrentLoggedUser {
    private final UUID id;
    private final String email;
    private final String username;
    private final String firstName;
    private final String lastName;
    private final String[] roles;
    private final String street;
    private final String houseNumber;
    private final String city;
    private final String postcode;
    private final String province;
    private final String country;
    private final String phoneNumber;
}
