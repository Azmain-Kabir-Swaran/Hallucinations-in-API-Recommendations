package org.example;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

public class Application implements ApplicationListener<ApplicationPreparedEvent> {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(Application.class)
                .listeners(new Application())
                .run(args);
    }

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        // Perform some task before the application starts running...
        System.out.println("Application is prepared");
    }
}