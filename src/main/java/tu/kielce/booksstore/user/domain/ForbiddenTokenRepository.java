package tu.kielce.booksstore.user.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ForbiddenTokenRepository extends JpaRepository<ForbiddenToken, UUID> {
    long deleteAllByUserId(UUID userId);
}
