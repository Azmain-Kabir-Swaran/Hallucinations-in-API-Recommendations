package org.example;


import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Application started");
        logger.debug("This is a debug message");
        logger.error("Something went wrong", new Exception("testing"));
    }
}