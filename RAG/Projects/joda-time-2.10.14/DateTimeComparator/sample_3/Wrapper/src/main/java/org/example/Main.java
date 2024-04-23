package org.example;


import org.joda.time.DateTime;
import org.joda.time.comparator.DateTimeComparator;

public class Main {

    public static void main(String[] args) {
        DateTime date1 = new DateTime(2022, 5, 1, 10, 30);
        DateTime date2 = new DateTime(2022, 5, 2, 10, 30);

        DateTimeComparator comparator = DateTimeComparator.getInstance();

        System.out.println("date1 is before date2: " + comparator.compare(date1, date2) < 0);
        System.out.println("date1 is after date2: " + comparator.compare(date1, date2) > 0);
        System.out.println("date1 is equal to date2: " + comparator.compare(date1, date2) == 0);
    }
}