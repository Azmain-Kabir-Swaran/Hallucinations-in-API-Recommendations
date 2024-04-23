package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MDC.put("key", "value");

        logger.info("Logging an event with MDC.");

        // MDC will be cleared after use
        System.out.println("MDC Value: " + MDC.get("key")); 
    }
}