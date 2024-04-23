package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // Setting user information to MDC
        MDC.put("user", "testUser");
        logger.info("User logged in.");

        // Removing user information from MDC
        MDC.remove("user");
        logger.info("User logged out.");
    }
}