package org.example;


import org.joda.time.DateTime;
import org.joda.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    
    public static void main(String[] args) {
        // Uses the joda-time-2.10.14's Duration class
        DateTime start = new DateTime();
        System.out.println("Duration start is: " + start);
        
        DateTime end = start.plusDays(2);
        System.out.println("Duration end is: " + end);
        
        Duration duration = new Duration(start, end);
        System.out.println("Duration is: " + duration.getMillis() + " milliseconds");
        
        // Uses java.time's LocalDate and Period classes
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);

        LocalDate nextWeek = today.plus(Period.ofWeeks(1));
        System.out.println("Date in one week: " + nextWeek);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = nextWeek.format(formatter);
        System.out.println("Formatted date: " + formattedDate);
    }
}