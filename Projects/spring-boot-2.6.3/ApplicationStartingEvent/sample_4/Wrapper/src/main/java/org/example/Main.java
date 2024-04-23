package org.example;


import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class Main implements ApplicationListener<ApplicationStartingEvent> {

    public static void main(String[] args) {
        // this will trigger the onApplicationEvent method
        SpringApplication app = new SpringApplication(Main.class);
        app.run(args);
    }

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("Spring Application is starting");
        // Add your logic here
    }
}