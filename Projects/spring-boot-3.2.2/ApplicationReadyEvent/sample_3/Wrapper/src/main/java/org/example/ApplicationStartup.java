package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

class ApplicationStartup {
    @EventListener(ApplicationReadyEvent.class)
    public void handleApplicationReady() {
        System.out.println("Application is ready.");
    }
}