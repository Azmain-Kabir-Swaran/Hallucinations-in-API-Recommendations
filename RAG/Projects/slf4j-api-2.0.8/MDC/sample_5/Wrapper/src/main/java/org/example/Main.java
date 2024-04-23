package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // Setting up the MDC
        MDC.put("requestId", "1");
        MDC.put("userId", "user1");

        // Log message
        logger.info("Request Started");
        
        // Clearing the MDC
        MDC.clear();
        
        // Log message
        logger.info("Request Finished");
    }
}