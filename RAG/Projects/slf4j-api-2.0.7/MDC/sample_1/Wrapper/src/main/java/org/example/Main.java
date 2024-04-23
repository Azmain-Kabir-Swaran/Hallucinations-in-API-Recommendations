package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // Set the MDC 
        MDC.put("customerId", "12345");
        MDC.put("storeId", "2");

        logger.info("Started program");
        
        String custId = MDC.get("customerId");
        String storeId = MDC.get("storeId");

        logger.info("Customer ID: " + custId);
        logger.info("Store ID: " + storeId);
        
        // Clearing the MDC.
        MDC.clear();

        logger.info("Ended program");
    }
}