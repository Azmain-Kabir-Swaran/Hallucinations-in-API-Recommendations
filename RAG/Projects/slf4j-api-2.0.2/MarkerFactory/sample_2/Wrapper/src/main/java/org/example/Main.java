package org.example;


import org.slf4j.MarkerFactory;

public class Main {

    public static void main(String[] args) {
        // Create marker using MarkerFactory
        org.slf4j.Marker marker = MarkerFactory.getMarker("MY_MARKER");
       
        // Using other APIs without dependencies
        java.time.LocalDate now = java.time.LocalDate.now();
        int dayOfMonth = now.getDayOfMonth();

        System.out.println("Marker obtained: " + marker);
        System.out.println("Today's day of the month: " + dayOfMonth);
    }
}