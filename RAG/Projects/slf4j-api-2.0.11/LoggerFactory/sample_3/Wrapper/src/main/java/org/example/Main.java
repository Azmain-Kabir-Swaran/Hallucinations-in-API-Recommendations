package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.joda.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        LocalTime currentTime = new LocalTime();
        logger.info("The current local time is: " + currentTime);
    }
}