package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MarkerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // Usage of MarkerFactory and its API
        logger.info(MarkerFactory.getMarker("INFO"), "Log message with Marker");
    }
}