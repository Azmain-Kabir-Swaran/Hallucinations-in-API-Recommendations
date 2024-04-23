package org.example;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

public class Main {

    private static final Log log = LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        try {
            log.info("Starting the application...");

            // Your main logic goes here

            log.info("Application finished.");
        } catch (LogConfigurationException e) {
            log.error("Error while starting the application", e);
        }
    }
}