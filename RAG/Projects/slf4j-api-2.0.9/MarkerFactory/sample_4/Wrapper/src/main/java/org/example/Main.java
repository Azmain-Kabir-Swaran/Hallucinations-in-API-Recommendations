package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {
    static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Marker marker = MarkerFactory.getMarker("EXAMPLE");
        logger.info(marker, "Hello, World!");
    }
}