package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;

public class Main {

    public static void main(String[] args) {
        DateTime now = DateTime.now();
        System.out.println("Current date/time is: " + now);

        // Freeze the clock at the current instant
        DateTimeUtils.setCurrentMillisFixed(now.getMillis());

        // ... perform some operations ...

        // Unfreeze the clock and reset to the actual current instant
        DateTimeUtils.setCurrentMillisSystem();
    }
}