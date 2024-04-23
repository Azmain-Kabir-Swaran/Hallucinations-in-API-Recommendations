package org.example;


import org.joda.time.DateTime;
import org.joda.time.Interval;

public class Main {

    public static void main(String[] args) {

        DateTime start = new DateTime(2015, 1, 1, 10, 0);
        DateTime end = new DateTime(2016, 1, 1, 10, 0);
        Interval interval = new Interval(start, end);
        long days = interval.toDuration().getMillis() / (1000 * 60 * 60 * 24);
        System.out.println("Difference in days: " + days);
    }
}