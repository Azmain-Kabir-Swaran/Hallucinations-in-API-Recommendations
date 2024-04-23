package org.example;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

public class ApplicationStartedEvent implements ApplicationListener<ContextStartedEvent> {

    @EventListener
    public void handleContextStarted(ContextStartedEvent event) {
        System.out.println("Application Context Started Event caught: " + event.getTimestamp());
    }

    @EventListener
    public void handleContextRefreshed(ContextRefreshedEvent event) {
        System.out.println("Application Context Refreshed Event caught: " + event.getTimestamp());
    }

    @EventListener
    public void handleContextStopped(ContextStoppedEvent event) {
        System.out.println("Application Context Stopped Event caught: " + event.getTimestamp());
    }

    @EventListener
    public void handleContextClosed(ContextClosedEvent event) {
        System.out.println("Application Context Closed Event caught: " + event.getTimestamp());
    }

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("Custom ApplicationStartedEvent caught: " + event.getTimestamp());
    }
}