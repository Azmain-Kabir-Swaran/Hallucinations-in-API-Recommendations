package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("This is a info log in Main.class");
        logger.debug("This is a debug log in Main.class");
        logger.error("This is an error log in Main.class");
    }
}