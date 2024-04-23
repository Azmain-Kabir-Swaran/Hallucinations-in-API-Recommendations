package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MDC.put("userId", "12345");
        logger.info("User logged in.");
        
        MDC.clear(); //Optional: clears the MDC after it is used.
    }
}