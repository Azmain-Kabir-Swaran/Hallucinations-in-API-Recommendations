package org.example;


import org.joda.time.*;
import org.joda.time.format.*;
import org.joda.time.PeriodType;

public class Main {

    public static void main(String[] args) {
        DateTime date1 = new DateTime(); // Current date/time
        DateTime date2 = date1.plusDays(10); // Add 10 days
        Period period = new Period(date1, date2, PeriodType.days()); // Create period of 10 days
        System.out.println("Period is: " + period.getDays() + " days");
    }
}