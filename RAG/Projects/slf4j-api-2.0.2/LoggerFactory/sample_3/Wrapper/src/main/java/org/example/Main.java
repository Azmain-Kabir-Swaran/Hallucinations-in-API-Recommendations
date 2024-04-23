package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("This is info message.");
        logger.debug("This is debug message.");
        logger.error("This is error message.");
    }
}