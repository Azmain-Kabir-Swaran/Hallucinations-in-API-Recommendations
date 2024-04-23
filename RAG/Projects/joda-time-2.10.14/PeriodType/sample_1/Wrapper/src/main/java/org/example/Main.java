package org.example;


import org.joda.time.DateTime;
import org.joda.time.PeriodType;
import org.joda.time.Period;

public class Main {
    public static void main(String[] args) {
        DateTime dtStart = new DateTime(); // Current date/time when executed
        DateTime dtEnd = dtStart.plusDays(15); // Add 15 days to the current date/time

        Period period = new Period(dtStart, dtEnd); // Create a period that includes the time difference between dtStart and dtEnd
        PeriodType periodType = PeriodType.forFields(PeriodType.FieldType.days(), PeriodType.FieldType.hours(), PeriodType.FieldType.minutes()); // Define a period type to include days, hours, and minutes

        int days = period.get(periodType); // Get the amount of days in the period (always returns days)
        int hours = period.get(PeriodType.hours()); // Get the amount of hours in the period (relative to the days)
        int minutes = period.get(PeriodType.minutes()); // Get the amount of minutes in the period (relative to the hours)

        System.out.printf("Period spans %d days, %d hours, and %d minutes%n", days, hours, minutes);
    }
}