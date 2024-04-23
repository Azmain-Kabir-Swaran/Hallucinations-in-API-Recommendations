package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        // Set key-value pair on MDC
        MDC.put("requestId", "12345");

        logger.info("Starting processing request...");

        // Do some processing...

        logger.info("Processing complete.");

        // Remove the key-value pair when you're done.
        MDC.remove("requestId");
    }
}