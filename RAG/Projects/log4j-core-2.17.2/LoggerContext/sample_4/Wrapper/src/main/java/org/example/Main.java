package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j3.core.LoggerContext;

public class Main {
    public static void main(String[] args) {
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        context.getConfiguration().getLoggerConfig(LogManager.ROOT_LOGGER_NAME);
        System.out.println("Successfully ran the LoggerContext getter");
    }
}