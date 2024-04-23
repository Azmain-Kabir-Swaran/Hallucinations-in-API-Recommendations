package org.example;


import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(Main.class);

        app.addListeners(new ApplicationListener<ApplicationStartingEvent>() {

            @Override
            public void onApplicationEvent(ApplicationStartingEvent event) {
                System.out.println("Application is starting");
            }
        });

        app.run(args);
    }
}