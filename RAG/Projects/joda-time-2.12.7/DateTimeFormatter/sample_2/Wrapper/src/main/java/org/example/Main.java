package org.example;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Get the current date and time
        DateTime dateTime = new DateTime();
        System.out.println("Current Date and Time is: " + dateTime.toString());

        // Define the desired date format
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

        // Print the current date and time in the defined format
        System.out.println("Current Date and Time in 'yyyy-MM-dd HH:mm:ss' format: " + formatter.print(dateTime));

        // Print the current date and time in ISO 8601 format
        System.out.println("Current Date and Time in ISO 8601 format: " + dateTime.toString());
    }
}