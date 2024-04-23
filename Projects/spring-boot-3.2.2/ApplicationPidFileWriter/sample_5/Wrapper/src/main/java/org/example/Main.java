package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;

public class Main {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication();
        app.addListeners(new ApplicationPidFileWriter("./your_app_name.pid"));
        app.run(args);
    }
}