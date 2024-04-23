package org.example;


import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.Context;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

public class Main {
    public static void main(String[] args) {
        // create context
        LoggerContext loggerContext = new LoggerContext();
        Context context = loggerContext.getContext();
        
        // create logger
        Logger logger = loggerContext.getLogger("mainLogger");
        logger.setLevel(Level.INFO);
        
        // add logger to context
        loggerContext.putLogger(loggerContext.getName(), logger);
        
        // print logger level
        System.out.println("Logger Level: " + logger.getLevel());
    }
}