package org.example;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
    private static final Log log = LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        log.info("Starting application...");
        try {
            // Your code here
        } catch (Exception e) {
            log.error("An error occurred: ", e);
        }
        log.info("Application finished.");
    }
}