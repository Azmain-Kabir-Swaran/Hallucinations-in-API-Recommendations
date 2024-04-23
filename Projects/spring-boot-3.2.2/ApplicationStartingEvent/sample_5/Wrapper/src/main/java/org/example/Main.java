package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.event.EventListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @EventListener(ApplicationStartingEvent.class)
    public void handleApplicationStartingEvent(ApplicationStartingEvent event) {
        // Add your custom logic here that needs to happen when the Spring Application is starting.
        System.out.println("Application is starting...");
    }
}