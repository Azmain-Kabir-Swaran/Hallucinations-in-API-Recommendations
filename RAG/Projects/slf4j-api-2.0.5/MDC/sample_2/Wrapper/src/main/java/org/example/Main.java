package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        try {

            MDC.put("log_id", "1");
            MDC.put("user_id", "123");

            logger.info("Logging into the application");

        } finally {

            MDC.clear();

        }

    }

}