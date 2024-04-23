package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;

public class Main {

    public static void main(String[] args) {

        // Use the builder pattern for simplicity.
        SpringApplication application = new SpringApplicationBuilder()
            .listeners(new ApplicationListener<ApplicationEnvironmentPreparedEvent>() {
                
                @Override
                public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
                    // Add your specific business logic here.
                }
            })
            // Add other application properties as needed.
            .build();

        // Run your spring boot application.
        application.run(args);
    }
}