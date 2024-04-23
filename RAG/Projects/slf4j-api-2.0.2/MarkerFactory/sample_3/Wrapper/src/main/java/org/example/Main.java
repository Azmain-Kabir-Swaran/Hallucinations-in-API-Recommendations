package org.example;


import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        Marker marker = MarkerFactory.getMarker("CUSTOM");

        logger.info(marker, "This is a custom marker log message.");
    }
}