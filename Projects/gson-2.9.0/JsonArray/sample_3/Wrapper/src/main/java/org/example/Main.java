package org.example;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        // Create a JsonArray
        JsonArray jsonArray = new JsonArray();

        // Add elements to the JsonArray
        jsonArray.add("Element 1");
        jsonArray.add("Element 2");

        // Print elements of the JsonArray
        for (int i = 0; i < jsonArray.size(); i++) {
            System.out.println(jsonArray.get(i));
        }
    }
}