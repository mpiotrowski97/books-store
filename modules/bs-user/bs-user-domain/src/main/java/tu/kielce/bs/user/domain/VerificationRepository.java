package tu.kielce.bs.user.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VerificationRepository extends JpaRepository<Verification, UUID> {
}
