package org.example;


import org.apache.commons.logging.LogConfigurationException;

public class Main {

    public static void main(String[] args) {
        try {
            throw new LogConfigurationException("Log Configuration Exception");
        } catch (LogConfigurationException e) {
            e.printStackTrace();
        }
    }
}