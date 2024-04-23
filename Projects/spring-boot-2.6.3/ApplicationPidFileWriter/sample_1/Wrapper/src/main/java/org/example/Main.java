package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.metrics.BufferingApplicationStartup;
import org.springframework.boot.context.metrics.startup.StartupTimeline;

public class Main {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Main.class);
        springApplication.setApplicationStartup(new BufferingApplicationStartup(new StartupTimeline()));
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);
    }
}