package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    
    @EventListener(ApplicationReadyEvent.class)
    @Override
    public void run() {
        // Add your logic here. This method will be called once the application is ready.
        System.out.println("Application is ready");
    }
}