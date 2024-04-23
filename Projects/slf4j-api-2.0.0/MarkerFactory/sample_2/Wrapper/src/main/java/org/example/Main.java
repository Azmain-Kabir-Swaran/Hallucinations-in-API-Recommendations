package org.example;


import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {

    public static void main(String[] args) {
        MarkerFactory markerFactory = MarkerFactory.getMarkerFactory();
        Marker marker = markerFactory.getMarker("my_marker");
        System.out.println(marker.getName());
    }
}