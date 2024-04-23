package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {

    public static void main(String[] args) {
        // Initialize a logger
        Logger logger = LoggerFactory.getLogger(Main.class);

        // Get a marker for this particular log statement
        Marker startMarker = MarkerFactory.getMarker("start");

        // Test with a start marker
        logger.info(startMarker, "Testing markers");

        // Test without a marker
        logger.info("Testing markers without a marker");
    }
}