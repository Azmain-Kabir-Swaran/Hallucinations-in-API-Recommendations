package org.example;


import org.slf4j.MarkerFactory;
import org.slf4j.Marker;

public class Main {
    public static void main(String[] args) {
        // Usage of MarkerFactory API 
        Marker marker = MarkerFactory.getMarker("Marker in use");
        System.out.println("This is a Marker: " + marker.getName());
    }
}