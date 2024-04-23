package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

public class Main implements ApplicationListener<ApplicationPreparedEvent> {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Main.class);
        application.addListeners(new Main());
        application.run(args);
    }

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        // code that runs when the ApplicationPreparedEvent is fired
    }
}