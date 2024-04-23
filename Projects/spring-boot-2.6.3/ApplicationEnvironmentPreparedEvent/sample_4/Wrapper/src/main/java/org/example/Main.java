package org.example;


import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("ApplicationEnvironmentPreparedEvent received");
        // Use event.getEnvironment() to access the Environment that the application is going to run with
    }
}