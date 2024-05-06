package com.kodelan.authcode.services;

import com.kodelan.authcode.enums.EmailTemplateName;
import jakarta.mail.MessagingException;

public interface EmailService {
    public void sendEmail(
            String to,
            String email,
            EmailTemplateName emailTemplate,
            String confirmationUrl,
            String activationCode,
            String subject
    ) throws MessagingException;
}
