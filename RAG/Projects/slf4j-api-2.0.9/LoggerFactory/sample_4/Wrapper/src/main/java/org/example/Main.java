package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Starting the application...");
        LOGGER.debug("This is a debug message");
        LOGGER.error("An error has occurred");
        LOGGER.warn("This is a warning");
        LOGGER.trace("Trace message");
        LOGGER.info("Exiting the application...");
    }
}