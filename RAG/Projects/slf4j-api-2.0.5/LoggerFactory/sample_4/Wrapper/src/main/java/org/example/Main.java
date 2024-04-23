package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("Debugging");
        logger.info("Information");
        logger.warn("Warning");
        logger.error("Error");
    }
}