package org.example;


import org.slf4j.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MDC.put("key", "value");
        logger.info("Hello, World!");
        MDC.remove("key");
    }
}