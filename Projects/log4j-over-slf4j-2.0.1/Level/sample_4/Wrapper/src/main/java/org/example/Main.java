package org.example;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static Logger logger = (Logger) LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.log(Level.DEBUG, "This is a debug message.");
        logger.log(Level.INFO, "This is an info message.");
        logger.log(Level.WARN, "This is a warn message.");
        logger.log(Level.ERROR, "This is an error message.");
        logger.log(Level.FATAL, "This is a fatal message.");
    }
}