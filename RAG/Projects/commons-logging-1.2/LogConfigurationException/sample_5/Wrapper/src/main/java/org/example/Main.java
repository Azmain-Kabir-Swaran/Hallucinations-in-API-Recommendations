package org.example;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

public class Main {
    public static void main(String[] args) throws LogConfigurationException {
        Log log = LogFactory.getLog(Main.class);
        log.info("Logging test message");
    }
}