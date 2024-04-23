package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Start application");
        logger.debug("This is a debug message");
        logger.error("An error occurred", new Exception("Test exception"));
        logger.info("End application");
    }
}