package org.example;


import org.slf4j.MarkerFactory;
import org.slf4j.Marker;

public class Main {

    public static void main(String[] args) {
        // Create a Marker
        Marker myMarker = MarkerFactory.getMarker("MY_MARKER");

        // Now you can use your new Marker...
        if (myMarker.contains(MarkerFactory.getDetachedMarker("MY_MARKER"))) {
            // do something here...
        }
    }
}