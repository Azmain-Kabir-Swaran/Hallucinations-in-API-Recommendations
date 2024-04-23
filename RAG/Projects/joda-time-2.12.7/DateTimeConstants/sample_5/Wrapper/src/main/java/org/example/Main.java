package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

public class Main {
    public static void main(String[] args) {
        DateTime now = new DateTime();

        System.out.println("Today's day of the week: " + now.getDayOfWeek());
        System.out_println("Today is " + now.getDayOfWeek() + ", so it is " + ((now.getDayOfWeek() == DateTimeConstants.MONDAY) ? "also a Monday" : "not a Monday"));
    }
}