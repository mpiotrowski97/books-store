package tu.kielce.bs.user.domain.services;

import org.springframework.stereotype.Service;
import tu.kielce.bs.users.domain.Verification;

import java.util.UUID;

@Service
public class VerificationService {
    public Verification createVerificationCode(UUID userId) {
        return Verification
                .builder()
                .userId(userId)
                .build();
    }
}
