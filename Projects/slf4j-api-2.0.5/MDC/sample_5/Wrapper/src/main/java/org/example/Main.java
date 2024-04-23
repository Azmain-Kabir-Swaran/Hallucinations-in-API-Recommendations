package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        
        // Set a new context
        MDC.put("requestId", "100");
        
        // Log message with the added context
        logger.info("Request processed by thread: {}", Thread.currentThread().getName());
        
        // Clear the context
        MDC.clear();

        // Use the cleared context (will return empty map)
        System.out.println(MDC.getCopyOfContextMap());
    }
}