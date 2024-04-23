package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

public class Main {
    
    public static void main(String[] args) {
        DateTime currentDateTime = new DateTime();
        
        System.out.println("Current Date: " + currentDateTime);
        System.out.println("Month of the year: " + currentDateTime.getMonthOfYear());
        System.out.println("Day of the week: " + currentDateTime.getDayOfWeek());
        System.out.println("Day of the year: " + currentDateTime.dayOfYear().get());
        System.out.println("Day of the Month: " + currentDateTime.getDayOfMonth());
        System.out.println("Hour of the day: " + currentDateTime.getHourOfDay());
        System.out.println("Minute of the day: " + currentDateTime.getMinuteOfDay());
        System.out.println("Year: " + currentDateTime.getYear());
    }
}