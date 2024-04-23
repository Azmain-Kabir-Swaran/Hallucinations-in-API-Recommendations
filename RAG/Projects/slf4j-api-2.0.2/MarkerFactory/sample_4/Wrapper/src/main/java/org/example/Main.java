package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);

        // Log with level
        logger.trace("trace level log");
        logger.debug("debug level log");
        logger.info("info level log");
        logger.warn("warn level log");
        logger.error("error level log");
    }
}