package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    // Import necessary API from the slf4j-api project.
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;

    // Create a Logger for this class.
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // Log a simple message.
        logger.info("This is a log message using slf4j");
    }
}