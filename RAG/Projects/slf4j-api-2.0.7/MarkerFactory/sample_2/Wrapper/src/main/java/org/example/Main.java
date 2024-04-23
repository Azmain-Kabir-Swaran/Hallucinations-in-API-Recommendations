package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static final Marker marker = MarkerFactory.getMarker("EVENT");

    public static void main(String[] args) {
        LOGGER.info(marker, "This is a marker");
    }

}