package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // Set "MDC" variable
        MDC.put("myVar", "This is a test");
        logger.info("Test log statement");
        // Clear "MDC" variable
        MDC.remove("myVar");
    }
}