package org.example;


import com.google.gson.JsonObject;

public class Main {

    public static void main(String[] args) {

        // Create a new JsonObject
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "John");
        jsonObject.addProperty("age", 30);
        jsonObject.addProperty("city", "New York");

        // Print the JsonObject
        System.out.println(jsonObject.toString());
    }
}