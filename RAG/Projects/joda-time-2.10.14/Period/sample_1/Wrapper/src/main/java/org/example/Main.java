package org.example;


import org.joda.time.DateTime;
import org.joda.time.Period;

public class Main {
    public static void main(String[] args) {

        DateTime startDate = new DateTime();  // current date and time
        DateTime endDate = startDate.plusDays(10);  // adding 10 days to the start date

        // calculating the difference between two dates
        Period period = new Period(startDate, endDate);

        System.out.println("Difference in days: " + period.getDays());
        System.out.println("Difference in hours: " + period.getHours());
        System.out.println("Difference in minutes: " + period.getMinutes());
    }
}