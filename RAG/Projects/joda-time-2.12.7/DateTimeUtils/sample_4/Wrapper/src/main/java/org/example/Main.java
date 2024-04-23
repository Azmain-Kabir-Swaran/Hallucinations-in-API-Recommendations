package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;

public class Main {
    public static void main(String[] args) {
        // Create a DateTime object
        DateTime dateTime = new DateTime();
        System.out.println("Current Date and Time: " + dateTime);
       
        // free the system clock
        DateTimeUtils.setCurrentMillisSystem();
       
        // Freeze time for testing purposes
        DateTimeUtils.setCurrentMillisFixed(new DateTime("2022-05-01T00:00:00.000").getMillis());
       
        // Create a DateTime object from a fixed point in time
        DateTime fixedDateTime = new DateTime();
        System.out.println("Fixed Date and Time: " + fixedDateTime);
    }
}