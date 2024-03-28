package br.com.api.emailservice.service;

import br.com.api.emailservice.entity.Email;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {

        this.mailSender = mailSender;
    }

    public void sendMail(Email email) {

        var message = new SimpleMailMessage();
        message.setFrom("noreply@email.com");
        message.setTo(email.getTo());
        message.setSubject(email.getSubject());
        message.setText(email.getBody());
        mailSender.send(message);

    }
}
