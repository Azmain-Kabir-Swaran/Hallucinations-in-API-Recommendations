package org.example;


import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;

public class Main {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication();
        app.addListeners(new SpringApplicationRunListener() {
            @Override
            public void failed(ApplicationContextInitializer<?> initializer, Throwable exception) {
                // Do something when the application fails to start.
            }
        });
        app.run(args);
    }
}