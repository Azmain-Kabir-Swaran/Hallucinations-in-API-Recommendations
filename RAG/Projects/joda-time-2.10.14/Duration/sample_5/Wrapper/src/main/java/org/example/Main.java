package org.example;


import org.joda.time.Duration;
import org.joda.time.Instant;

public class Main {
    public static void main(String[] args) {
        Instant start = new Instant();
        // Your codes here

        Instant end = new Instant();
        Duration duration = new Duration(start, end);
        System.out.println("Duration in milliseconds: " + duration.getMillis());
    }
}