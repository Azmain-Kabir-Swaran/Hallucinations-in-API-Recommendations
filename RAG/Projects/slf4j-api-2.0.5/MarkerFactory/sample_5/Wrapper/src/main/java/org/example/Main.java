package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        Marker marker = MarkerFactory.getMarker("MY_MARKER");
        
        logger.info(marker, "Info message with marker");
        logger.debug(marker, "Debug message with marker");
    }
}