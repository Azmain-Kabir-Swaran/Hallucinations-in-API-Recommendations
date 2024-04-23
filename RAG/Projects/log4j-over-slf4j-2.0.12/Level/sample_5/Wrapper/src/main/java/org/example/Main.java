package org.example;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.setLevel(Level.INFO);
        logger.debug("This is debug message");
        logger.info("This is info message");
        logger.warn("This is warning message");
        logger.error("This is error message");
        logger.fatal("This is fatal message");
    }
}