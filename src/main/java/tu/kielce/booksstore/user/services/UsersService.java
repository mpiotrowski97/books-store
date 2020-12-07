package tu.kielce.booksstore.user.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tu.kielce.booksstore.user.domain.SecurityUserDetails;
import tu.kielce.booksstore.user.domain.User;
import tu.kielce.booksstore.user.domain.UserRepository;
import tu.kielce.booksstore.user.exceptions.CannotDeleteYourselfException;
import tu.kielce.booksstore.user.exceptions.UserExistsException;
import tu.kielce.booksstore.user.validators.UserValidator;
import tu.kielce.booksstore.user.exceptions.UserDoesNotExistException;
import tu.kielce.booksstore.user.api.web.model.UserCreateModel;
import tu.kielce.booksstore.user.api.web.model.UserUpdateModel;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final UserValidator userValidator;

    public User create(UserCreateModel userCreateModel) throws UserExistsException {
        User user = User
                .builder()
                .email(userCreateModel.getEmail())
                .roles(userCreateModel.getUserTypes())
                .username(userCreateModel.getUsername())
                .enabled(userCreateModel.isEnabled())
                .password(passwordEncoder.encode(userCreateModel.getPassword()))
                .firstName(userCreateModel.getFirstName())
                .lastName(userCreateModel.getLastName())
                .phoneNumber(userCreateModel.getPhoneNumber())
                .city(userCreateModel.getCity())
                .postcode(userCreateModel.getPostcode())
                .street(userCreateModel.getStreet())
                .houseNumber(userCreateModel.getHouseNumber())
                .province(userCreateModel.getProvince())
                .country(userCreateModel.getCountry())
                .build();

        if (!userValidator.isUniqueUser(user)) {
            throw new UserExistsException();
        }

        return userRepository.save(user);
    }

    public void changePassword(UUID userId, String password) {
        User user = userRepository.findById(userId).orElse(null);

        if (null == user) {
            return;
        }

        user.setPassword(passwordEncoder.encode(password));
    }

    public void enableUser(UUID userId) {
        User user = userRepository
                .findById(userId)
                .orElse(null);

        if (null == user) {
            return;
        }

        user.enable();
    }

    public void delete(UUID id) {
        User user = userRepository
                .findById(id)
                .orElseThrow(UserDoesNotExistException::new);

        SecurityUserDetails securityUserDetails = (SecurityUserDetails) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();

        if (user.getEmail().equals(securityUserDetails.getEmail())) {
            throw new CannotDeleteYourselfException();
        }

        userRepository.delete(user);
    }

    public User update(UUID id, UserUpdateModel userUpdateModel) throws UserExistsException {
        User user = userRepository
                .findById(id)
                .orElseThrow(UserDoesNotExistException::new);

        user.setEmail(userUpdateModel.getEmail());
        user.setUsername(userUpdateModel.getUsername());
        user.setEnabled(userUpdateModel.isEnabled());
        user.setRoles(String.join(",", userUpdateModel.getRoles()));
        user.setFirstName(userUpdateModel.getFirstName());
        user.setLastName(userUpdateModel.getLastName());
        user.setPhoneNumber(userUpdateModel.getPhoneNumber());
        user.setCity(userUpdateModel.getCity());
        user.setPostcode(userUpdateModel.getPostcode());
        user.setStreet(userUpdateModel.getStreet());
        user.setHouseNumber(userUpdateModel.getHouseNumber());
        user.setProvince(userUpdateModel.getProvince());
        user.setCountry(userUpdateModel.getCountry());

        if (!StringUtils.isEmpty(userUpdateModel.getPassword())) {
            user.setPassword(passwordEncoder.encode(userUpdateModel.getPassword()));
        }

        if (!userValidator.isUniqueUser(user)) {
            throw new UserExistsException();
        }

        return userRepository.save(user);
    }
}
