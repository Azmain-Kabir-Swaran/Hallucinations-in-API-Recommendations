package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        // Put some values into the MDC
        MDC.put("client-id", "123");
        MDC.put("operation", "create");
        
        // Do some logging with the MDC values injected
        LOGGER.info("Processing request");
        
        // Clears the MDC for the calling thread as it's a good practice
        MDC.clear();
    }
}