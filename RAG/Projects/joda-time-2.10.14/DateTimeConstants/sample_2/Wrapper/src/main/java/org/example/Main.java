package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

public class Main {
    public static void main(String[] args) {
        // Create a new date time for the current date time
        DateTime dateTime = new DateTime();
        System.out.println("Current date and time: " + dateTime);

        // Get the current day of the week using DateTimeConstants
        int dayOfWeek = dateTime.getDayOfWeek();
        String dayName = getDayName(dayOfWeek);
        System.out.println("Day of the week: " + dayName);
    }

    private static String getDayName(int dayOfWeek) {
        switch (dayOfWeek) {
            case DateTimeConstants.MONDAY:
                return "Monday";
            case DateTimeConstants.TUESDAY:
                return "Tuesday";
            case DateTimeConstants.WEDNESDAY:
                return "Wednesday";
            case DateTimeConstants.THURSDAY:
                return "Thursday";
            case DateTimeConstants.FRIDAY:
                return "Friday";
            case DateTimeConstants.SATURDAY:
                return "Saturday";
            case DateTimeConstants.SUNDAY:
                return "Sunday";
            default:
                return "Invalid day";
        }
    }
}