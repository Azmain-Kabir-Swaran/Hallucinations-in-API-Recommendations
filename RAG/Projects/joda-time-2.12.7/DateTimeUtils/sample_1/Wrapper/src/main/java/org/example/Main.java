package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;

public class Main {

    public static void main(String[] args) {
        // Setting the current time
        DateTime now = DateTime.now();
        DateTimeUtils.setCurrentMillisFixed(now.getMillis());

        // Printing the current time
        System.out.println("Current time: " + now);
    }
}