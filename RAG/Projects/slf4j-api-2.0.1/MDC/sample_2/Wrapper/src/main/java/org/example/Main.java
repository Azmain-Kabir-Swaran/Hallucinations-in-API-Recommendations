package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        
        MDC.put("userId", "user-1");
        logger.info("This is an info message with MDC data.");
        MDC.clear();
    }
}