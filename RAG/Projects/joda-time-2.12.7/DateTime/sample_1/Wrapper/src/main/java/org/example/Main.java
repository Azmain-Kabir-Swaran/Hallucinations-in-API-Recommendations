package org.example;


import org.joda.time.DateTime;
import org.joda.time.Duration;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<DateTime> list = Arrays.asList(
                new DateTime(2020, 1, 1, 12, 0),
                new DateTime(2020, 2, 15, 8, 30),
                new DateTime(2020, 3, 30, 21, 45),
                new DateTime(2020, 4, 1, 10, 15),
                new DateTime(2020, 5, 15, 11, 45)
        );

        // Sort list in ascending order
        list = list.stream().sorted(DateTime::compareTo).collect(Collectors.toList());

        // Print sorted dates
        for (DateTime dateTime : list) {
            System.out.println(dateTime);
        }

        // Calculate average duration between sorted dates
        List<Duration> durations = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            durations.add(new Duration(list.get(i), list.get(i + 1)));
        }

        long totalMillis = durations.stream()
                .mapToLong(Duration::getMillis)
                .sum();

        double averageMillis = durations.isEmpty() ? 0 : ((double) totalMillis) / durations.size();
        System.out.println("Average duration between dates: " + averageMillis + " milliseconds");
    }
}