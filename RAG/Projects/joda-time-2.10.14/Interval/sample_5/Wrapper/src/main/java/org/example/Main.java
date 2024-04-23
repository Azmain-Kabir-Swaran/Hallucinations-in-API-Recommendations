package org.example;


import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;

public class Main {
    public static void main(String[] args) {
        DateTime start = new DateTime();
        DateTime end = start.plusHours(5);
        Interval interval = new Interval(start, end);

        System.out.println("Interval is: " + interval);

        // Add 30 minutes to the interval
        interval = interval.plus(new Duration(30, 0));
        System.out.println("Interval after adding 30 minutes: " + interval);

        // Subtract 2 hours and 15 minutes from the interval
        interval = interval.minus(new Duration(2, 0, 15, 0));
        System.out.println("Interval after subtracting 2 hours and 15 minutes: " + interval);
    }
}