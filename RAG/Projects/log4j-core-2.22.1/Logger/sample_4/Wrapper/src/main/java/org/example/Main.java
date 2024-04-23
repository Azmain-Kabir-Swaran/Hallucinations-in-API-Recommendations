package org.example;


import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class Main {

    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        logger.info("This is an info message");
        logger.debug("This is a debug message");
        logger.error("This is an error message");
    }
}