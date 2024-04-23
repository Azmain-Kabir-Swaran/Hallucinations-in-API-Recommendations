package org.example;


import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Period;

public class Main {
    public static void main(String[] args) {
        // Define the start and end dates
        DateTime startDate = new DateTime(2020, 10, 1, 0, 0, 0, 0);
        DateTime endDate = new DateTime(2021, 10, 1, 0, 0, 0, 0);
        
        // Create a period between the two dates
        Period period = new Period(startDate, endDate);
        
        // Print the results
        System.out.println("Years: " + period.getYears());
        System.outystem.out.println("Months: " + period.getMonths());
        System.out.println("Weeks: " + period.getWeeks());
        System.out.println("Days: " + period.getDays());
        System.out.println("Hours: " + period.getHours());
        System.out.println("Minutes: " + period.getMinutes());
        System.out.println("Seconds: " + period.getSeconds());
        System.out.println("Milliseconds: " + period.getMillis());
    }
}