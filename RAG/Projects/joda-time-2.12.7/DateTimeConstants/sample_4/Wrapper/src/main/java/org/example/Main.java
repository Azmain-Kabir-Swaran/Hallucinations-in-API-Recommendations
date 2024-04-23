package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

public class Main {
    public static void main(String[] args) {
        DateTime currentDateTime = new DateTime();
        
        int currentDayOfWeek = currentDateTime.getDayOfWeek();
        
        if (currentDayOfWeek == DateTimeConstants.MONDAY) {
            System.out.println("Today is Monday.");
        } else if (currentDayOfWeek == DateTimeConstants.TUESDAY) {
            System.out.println("Today is Tuesday.");
        } else if (currentDayOfWeek == DateTimeConstants.WEDNESDAY) {
            System.out.println("Today is Wednesday.");
        } else if (currentDayOfWeek == DateTimeConstants.THURSDAY) {
            System.out.println("Today is Thursday.");
        } else if (currentDayOfWeek == DateTimeConstants.FRIDAY) {
            System.out.println("Today is Friday.");
        } else if (currentDayOfWeek == DateTimeConstants.SATURDAY) {
            System.out.println("Today is Saturday.");
        } else if (currentDayOfWeek == DateTimeConstants.SUNDAY) {
            System.out.println("Today is Sunday.");
        }
    }
}