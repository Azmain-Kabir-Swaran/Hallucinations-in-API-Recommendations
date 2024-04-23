package org.example;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormat;

public class Main {
    public static void main(String[] args) {
        // Create a DateTime object representing the current moment in time
        DateTime currentMoment = new DateTime();

        // Create a DateTimeFormatter to format the DateTime as a string
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

        // Format the current moment and print it
        System.out.println(formatter.print(currentMoment));
    }
}