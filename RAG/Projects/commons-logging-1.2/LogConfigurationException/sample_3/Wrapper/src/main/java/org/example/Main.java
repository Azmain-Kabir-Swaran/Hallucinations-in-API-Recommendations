package org.example;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

public class Main {
    private static Log log = LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        try {
            log.info("Starting the application...");
            // place your code here
        } catch (LogConfigurationException e) {
            e.printStackTrace();
        }
    }
}