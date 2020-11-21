package tu.kielce.booksstore.security.listeners;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import tu.kielce.booksstore.security.domain.ForbiddenToken;
import tu.kielce.booksstore.security.domain.ForbiddenTokenRepository;
import tu.kielce.booksstore.security.events.ForbiddenPasswordEvent;
import tu.kielce.booksstore.users.domain.User;

@Component
@RequiredArgsConstructor
public class SendResetPasswordTokenListener {
    private final ForbiddenTokenRepository forbiddenTokenRepository;
    private final JavaMailSender javaMailSender;

    @EventListener
    @Async
    public void  handleForbiddenPasswordEvent(ForbiddenPasswordEvent forbiddenPasswordEvent) {
        User user = forbiddenPasswordEvent.getUser();

        ForbiddenToken forbiddenToken = forbiddenTokenRepository.save(ForbiddenToken
                .builder()
                .userId(forbiddenPasswordEvent.getUser().getId())
                .build());

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@example.org");
        message.setTo(user.getEmail());
        message.setSubject("Przypomnienie hasła");
        message.setText(forbiddenToken.getCode().toString());
        javaMailSender.send(message);
    }
}
