package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Logging an INFO message using Logback.");
        logger.debug("Logging a DEBUG message using Logback.");
        logger.error("Logging an ERROR message using Logback.");
        logger.warn("Logging a WARNING message using Logback.");
        logger.trace("Logging a TRACE message using Logback.");
    }
}