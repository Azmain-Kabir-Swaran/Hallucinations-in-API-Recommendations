package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MDC.put("ID", "12345");
        
        LOGGER.info("User [{}] logged in", MDC.get("ID"));
    }
}