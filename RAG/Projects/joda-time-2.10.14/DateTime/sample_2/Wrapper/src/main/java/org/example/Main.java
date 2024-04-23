package org.example;


import org.joda.time.DateTime;

public class Main {

    public static void main(String[] args) {
        DateTime now = new DateTime();
        System.out.println("Current date and time is: " + now);

        DateTime twoHoursFromNow = now.plusHours(2);
        System.out.println("Two hours from now it will be: " + twoHoursFromNow);
    }
}