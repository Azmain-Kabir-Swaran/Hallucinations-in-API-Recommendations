package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MDC.put("key1", "value1");
        MDC.put("key2", "value2");

        LOGGER.info("Here we are using MDC.");

        MDC.remove("key1");

        LOGGER.info("Now MDC does not contain key 'key1'.");

        try {
            MDC.put("key1", "value1");
            throw new RuntimeException("Something went wrong.");
        } finally {
            MDC.remove("key1");
        }

        LOGGER.info("Now MDC does not contain key 'key1'.");
    }
}