package org.example;


import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        // Create a JsonObject
        JsonObject jsonObject = new JsonObject();

        // Add properties to JsonObject
        jsonObject.addProperty("name", "John Doe");
        jsonObject.addProperty("age", 21);
        jsonObject.addProperty("city", "New York");

        // Print the JsonObject
        System.out.println(jsonObject);
    }
}