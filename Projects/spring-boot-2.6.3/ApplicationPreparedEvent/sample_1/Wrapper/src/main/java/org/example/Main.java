package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.EventListener;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Main.class, args);
    }
    
    @EventListener
    public void onApplicationStarting(ApplicationStartingEvent event) {
        System.out.println("Application is starting...");
    }

    @EventListener
    public void onApplicationReady(ApplicationReadyEvent event) {
        System.out.println("Application is ready.");
    }

    @Bean
    public ApplicationListener<ApplicationPreparedEvent> applicationPreparedEventApplicationListener() {
        return new ApplicationListener<ApplicationPreparedEvent>() {

            @Override
            public void onApplicationEvent(ApplicationPreparedEvent event) {
                // do something with the event
            }
        };
    }
}