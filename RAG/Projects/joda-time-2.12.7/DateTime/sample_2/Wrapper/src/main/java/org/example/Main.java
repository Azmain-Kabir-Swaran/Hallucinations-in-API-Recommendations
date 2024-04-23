package org.example;


import org.joda.time.DateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        DateTime currentDateAndTime = new DateTime();
        System.out.println("Current Date and Time: " + currentDateAndTime.toString());

        List<DateTime> dateTimes = Arrays.asList(
                new DateTime(),
                new DateTime().minusDays(1),
                new DateTime().minusMonths(1),
                new DateTime().minusYears(1)
        );
        
        dateTimes.stream()
                .map(date -> date.toString())
                .forEach(System.out::println);
    }
}