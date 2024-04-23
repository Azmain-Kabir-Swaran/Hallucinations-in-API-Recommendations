package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

public class Main {
    public static void main(String[] args) {
        // Get the current date and time
        DateTime now = new DateTime();
        System.out.println("Current Date and Time: " + now);

        // Get the current day of the week (0-6 for Sunday to Saturday)
        int dayOfWeek = now.getDayOfWeek();
        System.out.println("Current day of week: " + dayOfWeek);

        // Get the current month (1-12)
        int monthOfYear = now.getMonthOfYear();
        System.out.println("Current month: " + monthOfYear);

        // Get the current day of the month (1-31)
        int dayOfMonth = now.getDayOfMonth();
        System.out.println("Current day of month: " + dayOfMonth);

        // Get the current hour of the day (0-23)
        int hourOfDay = now.getHourOfDay();
        System.out.println("Current hour of day: " + hourOfDay);
    }
}