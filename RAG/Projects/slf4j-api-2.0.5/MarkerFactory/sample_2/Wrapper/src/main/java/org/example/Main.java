package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final Marker marker = MarkerFactory.getMarker("MY_MARKER");

    public static void main(String[] args) {
        logger.info(marker, "This message is associated with a marker");
    }
}