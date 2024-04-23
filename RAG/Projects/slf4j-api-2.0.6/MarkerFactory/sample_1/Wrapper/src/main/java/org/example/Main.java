package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MarkerFactory;
import org.slf4j.Marker;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);

        Marker marker = MarkerFactory.getMarker("MARKER");

        logger.debug(marker, "This is a debug message with Marker");
        logger.info(marker, "This is an info message with Marker");
        logger.warn(marker, "This is a warn message with Marker");
        logger.error(marker, "This is an error message with Marker");
    }
}