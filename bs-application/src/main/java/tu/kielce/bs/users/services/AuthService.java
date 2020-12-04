package tu.kielce.bs.users.services;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import tu.kielce.bs.users.domain.ForbiddenToken;
import tu.kielce.bs.users.domain.ForbiddenTokenRepository;
import tu.kielce.bs.users.domain.Verification;
import tu.kielce.bs.users.domain.VerificationRepository;
import tu.kielce.bs.users.events.ForbiddenPasswordEvent;
import tu.kielce.bs.users.events.UserRegisteredEvent;
import tu.kielce.bs.users.mappers.RegisterModelToUserCreateModelMapper;
import tu.kielce.bs.users.web.model.ForbiddenPasswordModel;
import tu.kielce.bs.users.web.model.RegisterModel;
import tu.kielce.bs.users.web.model.ResetPasswordModel;
import tu.kielce.bs.users.web.model.VerificationModel;
import tu.kielce.bs.users.domain.User;
import tu.kielce.bs.users.domain.UserRepository;
import tu.kielce.bs.users.domain.UserType;
import tu.kielce.bs.users.exceptions.UserExistsException;

import java.util.UUID;


@Service
@RequiredArgsConstructor
public class AuthService {
    private final UsersService usersService;
    private final UserRepository userRepository;
    private final ForbiddenTokenRepository forbiddenTokenRepository;
    private final VerificationRepository verificationRepository;
    private final ApplicationEventPublisher applicationEventPublisher;
    private final RegisterModelToUserCreateModelMapper registerModelToUserCreateModelMapper;

    public void register(RegisterModel registerModel) throws UserExistsException {
        User user = usersService.create(
                registerModelToUserCreateModelMapper.map(
                        registerModel,
                        new UserType[]{UserType.ROLE_USER},
                        false
                )
        );

        applicationEventPublisher.publishEvent(UserRegisteredEvent.of().user(user).build());
    }

    public void resetUserPassword(ResetPasswordModel resetPasswordModel) {
        ForbiddenToken forbiddenToken = forbiddenTokenRepository
                .findById(UUID.fromString(resetPasswordModel.getCode()))
                .orElse(null);

        if (null == forbiddenToken) {
            return;
        }

        usersService.changePassword(forbiddenToken.getUserId(), resetPasswordModel.getPassword());

        forbiddenTokenRepository.delete(forbiddenToken);
    }

    public void verifyUser(VerificationModel verificationModel) {
        Verification verification = verificationRepository
                .findById(UUID.fromString(verificationModel.getCode()))
                .orElse(null);

        if (null == verification) {
            return;
        }

        usersService.enableUser(verification.getUserId());

        verificationRepository.delete(verification);
    }

    public void forbiddenPassword(ForbiddenPasswordModel forbiddenPasswordModel) {
        User user = userRepository.findByEmail(forbiddenPasswordModel.getEmail()).orElse(null);

        if (null == user) {
            return;
        }

        forbiddenTokenRepository.deleteAllByUserId(user.getId());

        applicationEventPublisher.publishEvent(ForbiddenPasswordEvent.of().user(user).build());
    }
}
