package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        Marker startMarker = MarkerFactory.getMarker("START");
        Marker finishMarker = MarkerFactory.getMarker("FINISH");

        logger.info(startMarker, "start...");
        // do something...
        logger.info(finishMarker, "finish.");
    }
}