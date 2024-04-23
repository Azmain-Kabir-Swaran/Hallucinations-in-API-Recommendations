package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MDC.put("userID", "12345");
        logger.info("Starting program");
        logger.info("User with ID: {} accessed", MDC.get("userID"));
        MDC.clear();
        logger.info("Finished program");
    }
}