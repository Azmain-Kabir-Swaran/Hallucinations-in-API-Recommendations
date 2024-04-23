package org.example;


import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.util.StatusPrinter;

public class Main {
    public static void main(String[] args) {
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);

        Logger logger = lc.getLogger(Main.class);

        // Log at info level
        logger.info("Hello, World!");
    }
}