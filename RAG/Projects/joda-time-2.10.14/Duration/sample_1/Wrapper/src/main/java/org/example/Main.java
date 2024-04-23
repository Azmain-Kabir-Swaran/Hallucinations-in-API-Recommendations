package org.example;


import org.joda.time.Duration;
import org.joda.time.Instant;

public class Main {
    public static void main(String[] args) {
        Instant start = new Instant(); // get current instant
        // Do some operation here
        Instant end = new Instant(); // get current instant after operation

        Duration duration = new Duration(start, end);

        System.out.println("Operation took: " + duration.getMillis() + " milliseconds.");
    }
}