package org.example;


import org.slf4j.MarkerFactory;
import org.slf4j.Marker;

public class Main {
    public static void main(String[] args) {

        // Create a Marker
        Marker marker = MarkerFactory.getMarker("MyMarker");
        // Use the Marker
        System.out.println(marker);
    }
}