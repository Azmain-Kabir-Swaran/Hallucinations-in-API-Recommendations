package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.event.EventListener;

public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @EventListener(ApplicationFailedEvent.class)
  public void handleException(ApplicationFailedEvent event) {
    // add your exception handling logic here
    System.out.println("The application failed with exception: " + event.getException());
  }
}