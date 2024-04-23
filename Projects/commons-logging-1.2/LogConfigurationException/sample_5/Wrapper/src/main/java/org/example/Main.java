package org.example;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {

    public static void main(String[] args) {
        Log log = LogFactory.getLog(Main.class);
        
        try {
            // Code that may throw LogConfigurationException
        } catch (LogConfigurationException lce) {
            log.error("Error while logging", lce);
        }
    }
}