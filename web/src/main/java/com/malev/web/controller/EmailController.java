package com.malev.web.controller;

import com.malev.api.EmailApi;
import com.malev.domain.Email;
import com.malev.web.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class EmailController implements EmailApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailController.class);

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    @PostMapping("/email")
    /**
     * This method will send an email asynchronously
     * @param email the email to be sent
     */
    public Email sendEmail(@RequestBody Email email) {

        CompletableFuture<String> job = emailService.sendEmail();

        job.thenAccept( status -> {
            LOGGER.debug("email sent successfully");
        }).exceptionally( ex -> {
            LOGGER.debug(ex.getMessage());
            return null;
        });

        return email;
    }
}
