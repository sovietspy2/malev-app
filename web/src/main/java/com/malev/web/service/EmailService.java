package com.malev.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class EmailService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

    @Async
    public CompletableFuture<String> sendEmail() {
        LOGGER.debug("Sending email...");
        return CompletableFuture.completedFuture("OK SENT");
    }
}
