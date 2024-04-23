package org.example;


import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.core.Context;

public class Main {

    public static void main(String[] args) {
        LoggerContext loggerContext = new LoggerContext();
        ContextInitializer contextInitializer = new ContextInitializer(loggerContext);
        contextInitializer.autoConfig();
        Context context = loggerContext.getContext();
    }
}