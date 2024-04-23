package org.example;


import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class Main implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("Environment prepared with properties: " + event.getEnvironment());
    }

    public static void main(String[] args) {
        // You can add your application logic here.
        // Spring ApplicationContext will automatically be created and started.
    }
}