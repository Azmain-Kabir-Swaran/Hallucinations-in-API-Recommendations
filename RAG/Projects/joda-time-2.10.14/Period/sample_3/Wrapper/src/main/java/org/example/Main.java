package org.example;


import org.joda.time.DateTime;
import org.joda.time.Months;

public class Main {
    public static void main(String[] args) {
        DateTime now = new DateTime();
        Months months = Months.months(1);
        DateTime later = now.plus(months);
        System.out.println("Current date: " + now.toString("dd-MM-yyyy HH:mm:ss"));
        System.out.println("Date after adding a month: " + later.toString("dd-MM-yyyy HH:mm:ss"));
    }
}