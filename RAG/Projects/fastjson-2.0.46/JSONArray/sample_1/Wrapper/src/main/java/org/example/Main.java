package org.example;


import com.alibaba.fastjson.JSONArray;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        // Creating JSON array 
        JSONArray jsonArray = new JSONArray();

        jsonArray.add("Hello");
        jsonArray.add("World");

        // Print array
        System.out.println(jsonArray);

        // Searching element in the JSON array
        if (jsonArray.contains("World")) {
            System.out.println("World is in the array");
        } else {
            System.out.println("World is not in the array");
        }

        // Iterate over JSON array
        for (int i = 0; i < jsonArray.size(); i++) {
            System.out.println(jsonArray.getString(i));
        }

        // Sorting JSON array
        jsonArray.sort(Comparator.naturalOrder());
        System.out.println("Sorted JSON array: " + jsonArray);

        // Date formatting
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted date: " + dateFormat.format(date));
    }
}