package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("Debugging output");
        logger.info("Informational message");
        logger.warn("Warning output");
        logger.error("Error output");
    }

}