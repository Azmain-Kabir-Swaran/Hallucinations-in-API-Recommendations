package org.example;


import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

public class Main implements ApplicationListener<ApplicationPreparedEvent> {
    
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        // Your logic goes here
        System.out.println("Application has been prepared");
    }

    public static void main(String[] args) {
        // Starting point of your application
        // You can call your business logic here
        System.out.println("Main application started");
    }
}