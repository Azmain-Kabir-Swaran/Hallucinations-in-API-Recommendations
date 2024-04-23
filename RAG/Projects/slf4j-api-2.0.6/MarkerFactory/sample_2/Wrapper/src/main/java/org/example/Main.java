package org.example;


import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {
    public static void main(String[] args) {
        Marker marker = MarkerFactory.getMarker("myMarker");
        System.out.println(marker);
    }
}