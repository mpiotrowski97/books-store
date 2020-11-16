package tu.kielce.booksstore.security.services;

import org.springframework.stereotype.Service;
import tu.kielce.booksstore.security.domain.Verification;

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
