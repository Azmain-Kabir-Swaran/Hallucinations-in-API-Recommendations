package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.bootcontext.ApplicationContextInitializer;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

public class Main {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Main.class);
        springApplication.addInitializers(new ApplicationContextInitializer() {
            @Override
            public void initialize(ConfigurableApplicationContext applicationContext) {
                System.out.println("ApplicationContextInitialized");
            }
        });
        springApplication.run(args);
    }

    @EventListener
    public void handleApplicationStartingEvent(ApplicationStartingEvent event) {
        System.out.println("ApplicationStartingEvent caught");
    }

    @EventListener
    public void handleApplicationStartedEvent(ApplicationStartedEvent event) {
        System.out.println("ApplicationStartedEvent caught");
    }

}