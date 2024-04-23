package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    // Declare logger
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    // Main method
    public static void main(String[] args) {
        logger.trace("This is a trace log");
        logger.debug("This is a debug log");
        logger.info("This is an info log");
        logger.warn("This is a warn log");
        logger.error("This is an error log");
    }
}