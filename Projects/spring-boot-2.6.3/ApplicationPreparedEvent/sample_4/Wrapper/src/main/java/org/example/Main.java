package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

public class Main implements ApplicationListener<ApplicationPreparedEvent> {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        System.out.println("ApplicationPreparedEvent was fired! Now we are going to do something.");

        // Here you can put the code you need to run when ApplicationPreparedEvent is fired
    }
}