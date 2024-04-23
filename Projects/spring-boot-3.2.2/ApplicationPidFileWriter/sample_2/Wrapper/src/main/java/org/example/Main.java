package org.example;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.ConfigurableApplicationContext;

public class Main {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Main.class);
        application.addListeners(new ApplicationPidFileWriter("./app.pid"));
        ConfigurableApplicationContext context = application.run(args);

        // Do something with the context or arguments here...
        // context.getBean(...);
        // context.getBean(ApplicationArguments.class).getNonOptionArgs();
        // ...
    }
}