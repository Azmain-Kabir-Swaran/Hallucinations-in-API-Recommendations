package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;

public class Main {
    
    public static void main(String[] args) {
        DateTime date1 = new DateTime();
        DateTime date2 = date1.plusDays(3);

        DateTimeComparator dateTimeComparator = DateTimeComparator.getInstance();

        if (dateTimeComparator.compare(date1, date2) < 0) {
            System.out.println("Date1 is before Date2");
        } else if (dateTimeComparator.compare(date1, date2) > 0) {
            System.outout.println("Date1 is after Date2");
        } else {
            System.out.println("Date1 is equal to Date2");
        }
    }
}