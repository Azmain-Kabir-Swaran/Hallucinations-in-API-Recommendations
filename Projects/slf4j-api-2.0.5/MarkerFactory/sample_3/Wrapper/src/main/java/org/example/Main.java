package org.example;


import org.slf4j.MarkerFactory;

public class Main {
    public static void main(String[] args) {
        // Using MarkerFactory
        org.slf4j.Marker marker = MarkerFactory.getMarker("APP");
        // Using Math APIs
        double x = 20;
        double y = 10;
        double result = Math.sqrt(x*x + y*y);
        System.out.println(result);
    }
}