package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MDC.put("id", "123");

        logger.info("This is an information");
        logger.warn("This is a warning");
        logger.error("This is an error");

        MDC.remove("id");
    }

}