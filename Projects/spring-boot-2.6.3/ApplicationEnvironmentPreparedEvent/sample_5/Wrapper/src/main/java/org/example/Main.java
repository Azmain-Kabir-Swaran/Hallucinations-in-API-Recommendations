package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class Main implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Main.class).run(args);
    }

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        // your code here for handling the event
        System.out.println("Received event: " + event.toString());
    }
}