package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create Logger instance
        Logger logger = LoggerFactory.getLogger(Main.class);
        
        // Create Marker instance
        Marker marker = MarkerFactory.getMarker("MY_MARKER");
        
        // Log with Marker
        logger.info(marker, "Log with Marker: " + new Date());
    }
}