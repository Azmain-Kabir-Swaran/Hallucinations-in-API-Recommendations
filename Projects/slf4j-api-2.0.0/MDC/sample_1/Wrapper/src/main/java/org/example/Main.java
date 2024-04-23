package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MDC.put("transactionId", "12345");
        LOG.info("Transaction started.");

        // Some processing.

        MDC.remove("transactionId");
        LOG.info("Transaction ended.");
    }
}