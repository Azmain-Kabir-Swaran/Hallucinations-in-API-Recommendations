package org.example;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;

public class Main {
    private static final Log log = org.apache.commons.logging.LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        try {
            // Your code here
            log.info("Info message");
        } catch (LogConfigurationException ex) {
            log.error("Error occurred while configuring the log", ex);
        }
    }
}