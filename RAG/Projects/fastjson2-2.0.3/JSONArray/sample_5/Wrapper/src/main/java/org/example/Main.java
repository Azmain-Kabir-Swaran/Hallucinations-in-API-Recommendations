package org.example;


import com.alibaba.fastjson2.JSONArray;

public class Main {
    public static void main(String[] args) {
        // Create a JSONArray object
        JSONArray jsonArray = new JSONArray();

        // Add items to the JSONArray
        jsonArray.add("Item 1");
        jsonArray.add("Item 2");
        jsonArray.add("Item 3");

        // Print the JSONArray
        System.out.println(jsonArray);

        // Retrieve an item from the JSONArray
        System.out.out.println(jsonArray.get(1));

        // Remove an item from the JSONArray
        jsonArray.remove(0);

        // Print the JSONArray again
        System.out.println(jsonArray);
    }
}