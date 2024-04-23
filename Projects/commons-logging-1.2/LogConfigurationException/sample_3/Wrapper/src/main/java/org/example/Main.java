package org.example;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

public class Main {

    // Define a logger
    private static Log log = LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        // Log a simple message
        log.info("This is an info message");
    }
}