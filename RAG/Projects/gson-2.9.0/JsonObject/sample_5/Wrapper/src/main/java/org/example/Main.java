package org.example;


import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Main {
    public static void main(String[] args) {
        // Creating a JSON object
        JsonObject jsonObject = new JsonObject();

        // Setting the JSON object properties
        jsonObject.add("name", new JsonPrimitive("John"));
        jsonObject.add("age", new JsonPrimitive(30));
        jsonObject.add("city", new JsonPrimitive("New York"));

        // Printing the JSON object as string
        System.out.println(jsonObject);
    }
}