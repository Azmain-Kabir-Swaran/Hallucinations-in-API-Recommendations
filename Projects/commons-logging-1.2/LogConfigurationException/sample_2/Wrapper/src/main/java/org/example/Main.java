package org.example;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

public class Main {

    public static void main(String[] args) throws LogConfigurationException {
        Log log = LogFactory.getLog(Main.class);

        // Here we use the Apache Commons Logging facilities to log a message
        log.info("Testing commons-logging-1.2 package");

        // Let's throw a LogConfigurationException
        try {
            throw new LogConfigurationException("This is a log configuration exception");
        } catch (LogConfigurationException e) {
            // Log the exception
            log.error("Caught a LogConfigurationException: ", e);
        }
    }
}