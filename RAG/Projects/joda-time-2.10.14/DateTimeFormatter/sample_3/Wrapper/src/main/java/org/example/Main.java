package org.example;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime now = new DateTime();

        String dateString = formatter.print(now);
        System.out.println("Current date is: " + dateString);

        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("Original order:");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println("After shuffling:");
        System.out.println(list);
    }
}