package tu.kielce.bs.user.domain.listeners;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import tu.kielce.bs.users.domain.Verification;
import tu.kielce.bs.users.domain.VerificationRepository;
import tu.kielce.bs.user.domain.events.UserRegisteredEvent;
import tu.kielce.bs.user.domain.services.VerificationService;
import tu.kielce.bs.users.domain.User;

@Component
@RequiredArgsConstructor
public class SendVerificationCodeListener {
    private final VerificationService verificationService;
    private final JavaMailSender javaMailSender;
    private final VerificationRepository verificationRepository;

    @EventListener
    public void handleUserRegisteredEvent(UserRegisteredEvent userRegisteredEvent) {
        User user = userRegisteredEvent.getUser();

        Verification verification = verificationRepository.save(verificationService.createVerificationCode(
                user.getId()
        ));

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@example.org");
        message.setTo(user.getEmail());
        message.setSubject("Weryfikacja konta");
        message.setText(verification.getCode().toString());
        javaMailSender.send(message);
    }
}
