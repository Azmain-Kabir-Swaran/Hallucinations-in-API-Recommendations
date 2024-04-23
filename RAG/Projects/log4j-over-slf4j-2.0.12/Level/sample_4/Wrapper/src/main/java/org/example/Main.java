package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.trace("Trace Level: This is trace message");
        logger.debug("Debug Level: This is debug message");
        logger.info("Info Level: This is info message");
        logger.warn("Warn Level: This is warn message");
        logger.error("Error Level: This is error message");
        logger.fatal("Fatal Level: This is fatal message");
    }
}