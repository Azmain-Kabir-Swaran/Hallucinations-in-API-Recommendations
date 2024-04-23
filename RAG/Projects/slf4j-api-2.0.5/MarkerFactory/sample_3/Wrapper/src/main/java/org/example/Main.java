package org.example;


import org.slf4j.MarkerFactory;

public class Main {
    public static void main(String[] args) {
        String markerName = "MY_MARKER";
        org.slf4j.Marker marker = MarkerFactory.getMarker(markerName);

        System.out.println(marker);
    }
}