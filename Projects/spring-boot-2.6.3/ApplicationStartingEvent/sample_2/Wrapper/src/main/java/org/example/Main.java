package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Application implements ApplicationListener<ApplicationStartingEvent> {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.addListeners(new Application());
        application.run(args);
    }

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("Intercepted starting event: " + event);
    }
}