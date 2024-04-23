package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main implements ApplicationListener<ApplicationFailedEvent> {
    
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        Throwable exception = event.getException();
        // Your code to handle the exception
        System.out.println("An application failed to start: " + exception);
    }
}