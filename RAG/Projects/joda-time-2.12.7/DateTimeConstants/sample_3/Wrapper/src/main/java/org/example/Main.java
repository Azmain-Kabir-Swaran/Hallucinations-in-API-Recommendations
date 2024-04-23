package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

public class Main {
    
    public static void main(String[] args) {
        DateTime now = new DateTime();
        int dayOfWeek = now.getDayOfWeek();
        String dayOfWeekAsString = "";

        switch (dayOfWeek) {
            case DateTimeConstants.SUNDAY:
                dayOfWeekAsString = "Sunday";
                break;
            case DateTimeConstants.MONDAY:
                dayOfWeekAsString = "Monday";
                break;
            case DateTimeConstants.TUESDAY:
                dayOfWeekAsString = "Tuesday";
                break;
            case DateTimeConstants.WEDNESDAY:
                dayOfWeekAsString = "Wednesday";
                break;
            case DateTimeConstants.THURSDAY:
                dayOfWeekAsString = "Thursday";
                break;
            case DateTimeConstants.FRIDAY:
                dayOfWeekAsString = "Friday";
                break;
            case DateTimeConstants.SATURDAY:
                dayOfWeekAsString = "Saturday";
                break;
        }
        
        System.out.println("Today is: " + dayOfWeekAsString);
    }
}