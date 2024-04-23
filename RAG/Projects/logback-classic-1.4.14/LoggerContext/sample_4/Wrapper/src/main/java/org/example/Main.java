package org.example;


import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class Main {
    public static void main(String[] args) {
        LoggerContext loggerContext = new LoggerContext();

        Logger logger = loggerContext.getLogger("com.foo");
        logger.setLevel(Level.DEBUG);

        ILoggingEvent event = new ILoggingEvent();
        event.setMessage("Hello, World!");
        event.setLoggerName("com.foo");
        logger.addAppender(new ch.qos.logback.core.ConsoleAppender<ILoggingEvent>());
        logger.callAppenders(event);
    }
}