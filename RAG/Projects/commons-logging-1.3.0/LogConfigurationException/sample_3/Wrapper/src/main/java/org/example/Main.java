package org.example;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.impl.SimpleLog;

public class Main {
    public static void main(String[] args) {
        SimpleLog simpleLog = new SimpleLog("Main");
        try {
            // Some code that might throw LogConfigurationException
        } catch (LogConfigurationException ex) {
            simpleLog.error("An error occurred during logging configuration", ex);
        }
    }
}