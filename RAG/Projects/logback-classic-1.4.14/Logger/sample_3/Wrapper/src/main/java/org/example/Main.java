package org.example;


import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.encoder.Encoder;
import ch.qos.logback.core.spi.ContextAwareBase;

public class Main {
    public static void main(String[] args) {
        // create a Logger using the LoggerFactory
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        lc.getLoggerMap().clear();
        Logger logger = (Logger) LoggerFactory.getLogger(Main.class);

        logger.setLevel(Level.INFO);

        // create a logger level appender
        ConsoleAppender<ILoggingEvent> consoleAppender = new ConsoleAppender<>();
        consoleAppender.setName("CONSOLE");
        consoleAppender.setContext(lc);

        // create a layout and assign to the appender
        PatternLayoutEncoder layoutEncoder = new PatternLayoutEncoder();
        layoutEncoder.setContext(lc);
        layoutEncoder.setPattern("%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n");
        layoutEncoder.start();

        consoleAppender.setEncoder(layoutEncoder);
        consoleAppender.start();

        // add the newly created appender to the logger
        logger.addAppender(consoleAppender);

        // Log messages
        logger.info("This is a log message");
        logger.debug("This will not be logged due to the logger level");
    }
}