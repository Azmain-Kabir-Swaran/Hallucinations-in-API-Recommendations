package org.example;


import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class Main {
    public static void main(String[] args) {
        // assume 'context' is an instance of LoggerContext.
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        context.reset();
        StatusPrinter.print(context);
    }
}