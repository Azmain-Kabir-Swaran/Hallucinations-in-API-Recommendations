package org.example;


import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {
    public static void main(String[] args) {
        // create a marker instance with the name "DATABASE"
        Marker marker = MarkerFactory.getMarker("DATABASE");
        
        // the marker can be logged directly or used in a logger
        log.ifMarkerRespected(marker, "This message is only logged if a logger is configured to log messages with DATABASE marker");
    }
}