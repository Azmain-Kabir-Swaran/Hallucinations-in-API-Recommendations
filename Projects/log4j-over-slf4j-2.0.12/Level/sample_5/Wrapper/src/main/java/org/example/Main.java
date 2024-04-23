package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        // Using the SLF4J API to access a Logger named "myApp".
        Logger logger = LoggerFactory.getLogger("myApp");
        // Log an INFO message.
        logger.info("My App is logging some info.");
    }
}