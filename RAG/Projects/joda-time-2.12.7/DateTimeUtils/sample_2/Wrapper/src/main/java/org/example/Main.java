package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;

public class Main {
    public static void main(String[] args) {
        DateTime now = new DateTime();
        DateTime future = now.plusDays(10);

        DateTimeUtils.setCurrentMillisFixed(now.getMillis());
        DateTime currentDateTime = new DateTime();
        System.out.println("Current date time: " + currentDateTime);
    }
}