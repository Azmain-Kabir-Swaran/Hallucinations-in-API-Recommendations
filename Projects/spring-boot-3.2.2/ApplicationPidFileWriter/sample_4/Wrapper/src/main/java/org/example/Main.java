package org.example;


import org.springframework.boot.SpringApplication;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("server.port", "8080");
        SpringApplication app = new SpringApplication(MyApplication.class);
        app.setDefaultProperties(props);
        app.addListeners(new ApplicationPidFileWriter("app.pid"));
        app.run(args);
    }
}