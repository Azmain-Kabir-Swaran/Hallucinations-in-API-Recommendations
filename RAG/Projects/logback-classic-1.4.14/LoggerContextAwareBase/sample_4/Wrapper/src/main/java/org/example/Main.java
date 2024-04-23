package org.example;


import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;

public class Main {
    public static void main(String[] args) {
        // Create a logger context
        LoggerContext lc = new LoggerContext();
        Context context = (Context) lc;
        context.putProperty("propertyName", "propertyValue");

        // Create a context aware
        ContextAwareBase contextAwareBase = new ContextAwareBase();

        // Set the context
        contextAwareBase.setContext(context);
        
        // Access the property
        String propertyValue = context.getProperty("propertyName");
        System.out.println(propertyValue); // outputs: propertyValue
    }
}