package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("This is a log message using LoggerFactory");
        System.out.println("This is a regular System.out message");
    }
}