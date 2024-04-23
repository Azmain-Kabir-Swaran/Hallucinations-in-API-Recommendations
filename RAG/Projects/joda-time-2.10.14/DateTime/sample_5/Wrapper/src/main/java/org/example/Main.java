package org.example;


import org.joda.time.DateTime;
import org.joda.time.Period;

public class Main {
    public static void main(String[] args) {

        DateTime date1 = new DateTime(2020, 12, 25, 0, 0); 
        DateTime date2 = new DateTime(2022, 12, 25, 0, 0);
        
        Period period = new Period(date1, date2);
        
        System.out.println("Difference between dates in years: " + period.getYears());
        System.out.println("Difference between dates in months: " + period.getMonths());
        System.out.println("Difference between dates in days: " + period.getDays());
        System.out.println("Difference between dates in hours: " + period.getHours());
        System.out.println("Difference between dates in minutes: " + period.getMinutes());
    }
}