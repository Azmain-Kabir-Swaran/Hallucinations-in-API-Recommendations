package org.example;


import com.google.gson.JsonArray;

public class Main {
    public static void main(String[] args) {
        // Create a JsonArray
        JsonArray jsonArray = new JsonArray();
        
        // Add elements to the JsonArray
        jsonArray.add("Element 1");
        jsonArray.add("Element 2");
        jsonArray.add("Element 3");
        
        // Print the JsonArray as a string
        System.out.println(jsonArray.toString());
    }
}