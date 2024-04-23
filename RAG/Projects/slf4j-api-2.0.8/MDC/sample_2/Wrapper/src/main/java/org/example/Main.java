package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MDC.put("user", "User");
        MDC.put("date", "Today");

        logger.info("Test message from logger");

        // Prints User
        System.out.println(MDC.get("user"));

        // Prints Today
        System.out.println(MDC.get("date"));

        MDC.clear();
    }
}