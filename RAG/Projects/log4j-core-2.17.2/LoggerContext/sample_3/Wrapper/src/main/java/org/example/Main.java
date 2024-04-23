package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

public class Main {
    public static void main(String[] args) {
        LoggerContext loggerContext = (LoggerContext) LogManager.getContext(false);
        loggerContext.getConfiguration().getLoggerConfig("YourLoggerName");
    }
}