package org.example;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTime currentDate = new DateTime();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current date and time: " + fmt.print(currentDate));
    }
}