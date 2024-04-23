package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

class Main {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Main.class);
        app.addListeners(new ApplicationListener<ApplicationStartedEvent>() {
            @Override
            public void onApplicationEvent(ApplicationStartedEvent event) {
                // This method is called when the application is started
                System.out.println("Application started!");
            }
        });
        app.run(args);
    }
}