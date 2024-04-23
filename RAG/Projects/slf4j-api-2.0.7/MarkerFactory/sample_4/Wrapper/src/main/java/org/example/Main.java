package org.example;


import org.slf4j.MarkerFactory;
import org.slf4j.Marker;

public class Main {
    public static void main(String[] args) {
        Marker marker = MarkerFactory.getMarker("FATAL");
        System.out.println("Hello World!");
    }
}