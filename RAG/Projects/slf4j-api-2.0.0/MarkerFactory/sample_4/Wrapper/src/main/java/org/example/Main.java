package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static final Marker START_MARKER = MarkerFactory.getMarker("START");

    public static void main(String[] args) {
        LOGGER.info(START_MARKER, "Starting the application...");
        // Your application code...
    }
}