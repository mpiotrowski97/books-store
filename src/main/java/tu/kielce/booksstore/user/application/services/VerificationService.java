package tu.kielce.booksstore.user.application.services;

import org.springframework.stereotype.Service;
import tu.kielce.booksstore.user.domain.Verification;

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
