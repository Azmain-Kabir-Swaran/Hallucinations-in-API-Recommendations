package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("This is info message");
        logger.warn("This is warning message");
        logger.error("This is error message");
        logger.debug("This is debug message");
        logger.trace("This is trace message");
    }
}