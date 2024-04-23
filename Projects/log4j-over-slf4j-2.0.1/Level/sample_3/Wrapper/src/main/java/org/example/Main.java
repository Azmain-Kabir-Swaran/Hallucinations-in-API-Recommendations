package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("SLF4J is configured and running successfully! This is an informational message.");
        logger.debug("This is a debug message.");
        logger.error("This is an error message.");
    }
}