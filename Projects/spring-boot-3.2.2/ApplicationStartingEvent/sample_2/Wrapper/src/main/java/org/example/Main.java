package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main implements ApplicationListener<ApplicationStartingEvent> {
    
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
    }

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("Application is starting");
    }
}