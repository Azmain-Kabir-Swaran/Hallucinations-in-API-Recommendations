package org.example;

import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ApplicationFailedEvent;

public class ApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        Throwable exception = event.getApplicationContext().getFailureAnalysis().getRootCause();
        // handle the exception however you want
        System.out.println("Caught exception: " + exception);
    }
}