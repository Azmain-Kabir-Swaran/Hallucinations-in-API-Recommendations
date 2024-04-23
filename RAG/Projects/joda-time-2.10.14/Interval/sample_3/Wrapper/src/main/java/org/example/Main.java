package org.example;


import org.joda.time.DateTime;
import org.joda.time.Interval;

public class Main {
    public static void main(String[] args) {
        DateTime start = new DateTime(2010, 1, 1, 10, 0, 0);
        DateTime end = new DateTime(2010, 1, 1, 11, 0, 0);
        Interval interval = new Interval(start, end);
        
        System.out.println("Interval is " + interval.toString());
    }
}