package org.example;


import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Main {
    public static void main(String[] args) {
        // Create a new JsonObject
        JsonObject jsonObject = new JsonObject();

        // Add properties to the jsonObject
        jsonObject.add("name", new JsonPrimitive("John Doe"));
        jsonObject.add("age", new JsonPrimitive(30));
        jsonObject.add("city", new JsonPrimitive("New York"));

        // Output the JsonObject in String form
        System.out.println(jsonObject);
    }
}