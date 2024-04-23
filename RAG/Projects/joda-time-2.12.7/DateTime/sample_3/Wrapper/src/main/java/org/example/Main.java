package org.example;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.Interval;

public class Main {
    public static void main(String args[]) {
        DateTime dateTime1 = new DateTime(2016, 11, 11, 12, 12);
        DateTime dateTime2 = new DateTime(2020, 7, 15, 13, 55);
        
        Period period = new Period(dateTime1, dateTime2);
        System.out.println("The duration is: " + period);
    }
}