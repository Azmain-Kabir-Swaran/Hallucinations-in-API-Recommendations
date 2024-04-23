package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Main.class)
                .pidFileWriter(new ApplicationPidFileWriter())
                .build()
                .run(args);
    }
}