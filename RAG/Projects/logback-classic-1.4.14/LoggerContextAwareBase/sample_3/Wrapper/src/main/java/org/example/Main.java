package org.example;


import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        // Assuming you are using logback
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        loggerContext.reset();
        StatusPrinter.print(loggerContext);

        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("Hello, World!");
    }
}