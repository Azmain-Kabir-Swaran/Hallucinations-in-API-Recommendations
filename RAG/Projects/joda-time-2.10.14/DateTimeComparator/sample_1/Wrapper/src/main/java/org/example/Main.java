package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        DateTime dt1 = new DateTime("2020-08-22T22:00:00");
        DateTime dt2 = new DateTime("2020-08-23T22:00:00");
        
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss");

        // compare dates in terms of time
        DateTimeComparator comparator = DateTimeComparator.getInstance();
        int result = comparator.compare(dt1, dt2);

        if (result == 0) {
            System.out.println("The two dates are the same");
        } else if (result < 0) {
            System.out.println("The first date is before the second date");
        } else {
            System.out.println("The first date is after the second date");
        }
        
        String formattedDateTime = fmt.print(dt1);
        System.out.println("Formatted date and time: " + formattedDateTime);
    }
}