package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @EventListener
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("Application started");
        System.out.println(SpringBootVersion.getVersion());
    }
}