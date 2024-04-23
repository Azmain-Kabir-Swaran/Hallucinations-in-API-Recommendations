package org.example;


import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormat;

public class Main {
    public static void main(String[] args) {
        // current date-time
        DateTime now = new DateTime();
        System.out.println("Current DateTime : " + now);

        // date time formatter
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted DateTime : " + now.toString(fmt));

        // date
        Date date = new Date();
        org.joda.time.format.DateTimeFormatter fmtDate = org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd");
        System.out.println("Current Date : " + fmtDate.print(date.getTime()));

        // time zone
        DateTimeZone zone = DateTimeZone.getDefault();
        System.out.println("Default Time Zone : " + zone);

        // month
        int month = now.getMonthOfYear();
        System.out.println("Current Month : " + month);

        // year
        int year = now.getYear();
        System.out.println("Current Year : " + year);

        // day of month
        int dayOfMonth = now.dayOfMonth().get();
        System.out.println("Current Day of Month : " + dayOfMonth);

        // day of week
        int dayOfWeek = now.dayOfWeek().get();
        System.out.println("Current Day of Week : " + dayOfWeek);
    }
}