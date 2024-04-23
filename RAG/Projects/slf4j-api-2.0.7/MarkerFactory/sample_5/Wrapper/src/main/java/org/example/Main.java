package org.example;


import org.slf4j.MarkerFactory;
import org.slf4j.Marker;

public class Main {
    public static void main(String[] args) {
        // Create Marker
        Marker marker = MarkerFactory.getMarker("MY_MARKER");

        // Log messages using the Marker
        System.out.println("Log with marker MY_MARKER");
        if (marker.contains(Marker.ANY_MARKER)) {
            System.out.println("Marker contains ANY_MARKER");
        }

        if (marker.contains("MY_MARKER")) {
            System.out.println("Marker contains 'MY_MARKER'");
        }
    }
}