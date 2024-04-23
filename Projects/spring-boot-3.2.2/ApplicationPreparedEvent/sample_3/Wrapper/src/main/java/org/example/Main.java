package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

public class Main {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Main.class);
        app.addListeners(new ApplicationListener<ApplicationPreparedEvent>() {

            @Override
            public void onApplicationEvent(ApplicationPreparedEvent event) {
                ConfigurableApplicationContext context = event.getApplicationContext();
                System.out.println("ApplicationPreparedEvent received.");
            }
        });
        app.run(args);
    }
}