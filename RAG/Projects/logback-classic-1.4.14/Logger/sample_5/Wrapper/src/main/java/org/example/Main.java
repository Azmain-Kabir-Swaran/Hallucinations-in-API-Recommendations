package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        // Initialize the logger
        Logger logger = LoggerFactory.getLogger(Main.class);

        // Use the logger to log information
        logger.info("This is a log message from the program");

        // Simple math operations for demonstration
        int x = 5;
        int y = 10;
        int sum = x + y;
        logger.info("The sum of " + x + " and " + y + " is " + sum);
    }
}