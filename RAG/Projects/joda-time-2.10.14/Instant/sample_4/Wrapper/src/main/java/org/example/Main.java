package org.example;


import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Instant;

public class Main {
    public static void main(String[] args) {
        Instant now = new Instant(); // Current time
        Instant later = now.plus(new Duration(30 * 1000)); // Add 30 seconds from now

        DateTime dt = new DateTime(now);
        System.out.println("Current time is: " + now + ". Adding 30 seconds gives: " + later);
        System.out.println("In formatted date, time would be: " + dt.toString("yyyy-MM-dd HH:mm:ss"));
    }
}