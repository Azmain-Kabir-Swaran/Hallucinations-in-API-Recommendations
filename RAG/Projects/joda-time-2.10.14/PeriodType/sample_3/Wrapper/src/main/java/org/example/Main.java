package org.example;


import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Duration;

public class Main {
    public static void main(String[] args) {
        Period period = new Period(1, PeriodType.days());  // Define period of 1 day
        Duration duration = new Duration(period);  // Convert it to Duration

        System.out.println("Duration in millis: " + duration.getMillis());
    }
}