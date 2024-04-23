package org.example;


import org.slf4j.MarkerFactory;

public class Main {
    public static void main(String[] args) {
        // use MarkerFactory API as requested
        System.out.println(MarkerFactory.getMarker("Marker"));
    }
}