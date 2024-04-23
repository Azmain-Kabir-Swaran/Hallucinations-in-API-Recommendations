package org.example;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class Main {

    public static void main(String[] args) {
        
        Logger logger = LogManager.getLogger(Main.class);

        // Set the log level to debug
        Configurator.setRootLevel(Level.DEBUG);

        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
        
    }
}