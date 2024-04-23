package org.example;


import org.slf4j.MarkerFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("MarkerFactory Example");
        org.slf4j.Marker marker = MarkerFactory.getMarker("MYMARKER");
        System.out.println(marker.getName()); 
    }
}