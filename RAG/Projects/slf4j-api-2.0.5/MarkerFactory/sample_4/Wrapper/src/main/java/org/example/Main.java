package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {
    final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Marker marker = MarkerFactory.getMarker("MESSAGE_MARKER");

        logger.info(marker, "Hello, Slf4j!");
    }
}