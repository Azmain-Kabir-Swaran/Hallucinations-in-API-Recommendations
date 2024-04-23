package org.example;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // define two dates with the same time but different dates
        DateTime dateTime1 = new DateTime(2020, 11, 1, 23, 59, 59, 0);
        DateTime dateTime2 = new DateTime(2021, 11, 1, 23, 59, 59, 0);

        // compare the dates
        int comparisonResult = DateTimeComparator.getDateTimeComparator().compare(dateTime1, dateTime2);

        // print the result
        System.out.println("The comparison result is: " + comparisonResult);

        // You can also use it in collections
        List<DateTime> dateTimes = new ArrayList<>();
        dateTimes.add(dateTime2);
        dateTimes.add(dateTime1);
        Collections.sort(dateTimes, DateTimeComparator.getDateTimeComparator());

        // Print sorted dates
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        for (DateTime dateTime : dateTimes) {
            System.out.println("Sorted dates: " + dateTimeFormatter.print(dateTime));
        }
    }
}