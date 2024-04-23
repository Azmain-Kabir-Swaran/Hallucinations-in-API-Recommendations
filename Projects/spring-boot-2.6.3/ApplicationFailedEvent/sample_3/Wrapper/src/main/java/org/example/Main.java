package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ApplicationListener<ApplicationFailedEvent> {

    private Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Main.class);
        app.run(args);
    }

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        Throwable exception = event.getApplicationContext().getFailureAnalysis().getRootCause();
        log.error("Application failed with an exception: ", exception);
    }
}