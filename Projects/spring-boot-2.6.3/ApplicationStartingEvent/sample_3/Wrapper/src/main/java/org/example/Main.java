package org.example;


import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.SpringApplication;

public class Main implements ApplicationListener<ApplicationStartingEvent> {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Main.class);
        app.addListeners(new Main());
        app.run(args);
    }

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        // Your code here that you want to run before the application starts
        System.out.println("Application is starting...");
    }
}