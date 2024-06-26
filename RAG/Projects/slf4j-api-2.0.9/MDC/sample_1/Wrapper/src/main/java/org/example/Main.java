package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MDC.put("user", "user1");
        logger.info("Starting program.");
        MDC.clear();
        logger.info("Program ended.");
    }
}