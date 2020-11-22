package tu.kielce.booksstore.security.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface VerificationRepository extends JpaRepository<Verification, UUID> {
}