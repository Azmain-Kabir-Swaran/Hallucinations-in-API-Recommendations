package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        // Using log4j-over-slf4j-2.0.12 API.
        logger.info("Hello, World!");
    }
}