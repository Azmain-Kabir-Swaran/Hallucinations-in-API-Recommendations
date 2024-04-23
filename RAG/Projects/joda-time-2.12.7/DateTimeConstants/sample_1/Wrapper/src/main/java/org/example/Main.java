package org.example;


import org.joda.time.DateTimeConstants;
import org.joda.time.DateTime;

public class Main {

    public static void main(String[] args) {
        // Create a DateTime object with the current date and time
        DateTime dt = new DateTime();

        // Get the day of the month
        int dayOfMonth = dt.getDayOfMonth();
        System.out.println("Current Day of Month: " + dayOfMonth);

        // Get the day of the year
        int dayOfYear = dt.dayOfYear().get();
        System.out.println("Current Day of Year: " + dayOfYear);

        // Get the current hour of the day
        int currentHour = dt.getHourOfDay();
        System.out.println("Current Hour: " + currentHour);

        // Get the day of the week
        int dayOfWeek = dt.dayOfWeek().get() - 1;
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Current Day of the Week: " + weekDays[dayOfWeek]);
    }
}