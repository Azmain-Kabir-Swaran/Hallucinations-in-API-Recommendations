package org.example;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTime dt = new DateTime();
        System.out.println("Current Date and Time is: " + dt);

        String date = "2015-01-01 12:00:00";
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        DateTime dateTime = fmt.parseDateTime(date);
        System.out.println("Parsed Date and Time is: " + dateTime);
    }
}