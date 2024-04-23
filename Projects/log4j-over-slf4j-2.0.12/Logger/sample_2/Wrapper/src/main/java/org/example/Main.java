package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.debug("Debugging log");
        LOGGER.info("Info log");
        LOGGER.warn("Warning log");
        LOGGER.error("Error log");
    }
}