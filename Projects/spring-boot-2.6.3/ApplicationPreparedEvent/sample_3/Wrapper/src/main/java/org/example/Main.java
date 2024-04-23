package org.example;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class Main {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Main.class)
            .listeners(new ApplicationPreparedEventListener())
            .run(args);
    }

    @Component
    public static class ApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {
        @Override
        public void onApplicationEvent(ApplicationPreparedEvent event) {
            // Handle ApplicationPreparedEvent...
        }
    }
}