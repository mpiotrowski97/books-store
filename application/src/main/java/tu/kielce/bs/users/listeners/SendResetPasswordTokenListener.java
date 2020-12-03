package tu.kielce.bs.users.listeners;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import tu.kielce.bs.users.domain.ForbiddenToken;
import tu.kielce.bs.users.domain.ForbiddenTokenRepository;
import tu.kielce.bs.users.events.ForbiddenPasswordEvent;
import tu.kielce.bs.users.domain.User;

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
