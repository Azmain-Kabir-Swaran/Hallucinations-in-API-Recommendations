package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

public class Main {

    public static void main(String[] args) {
        // get the root logger
        LoggerContext context = (LoggerContext) LogManager.getContext(false);

        // start the loggers
        context.start();
        
        // get logger and use it
        org.apache.logging.log4j.Logger logger = context.getLogger();
        logger.info("Hello World!");

        // stop the loggers
        context.stop();
    }
}