package org.example;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        // Create a JsonArray
        JsonArray jsonArray = new JsonArray();

        // Add elements to the JsonArray
        jsonArray.add("value1");
        jsonArray.add("value2");
        jsonArray.add("value3");

        // Print the JsonArray
        System.out.println(jsonArray);

        // Check if the JsonArray contains a specific value
        boolean containsValue = jsonArray.contains("value2");
        System.out.println("JsonArray contains 'value2': " + containsValue);

        // Remove an element from the JsonArray
        jsonArray.remove("value1");

        // Print the JsonArray after removing an element
        System.out.println("JsonArray after removing 'value1': " + jsonArray);

        // Parse a JSON string to a JsonObject
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("key1", "value1");
        jsonObject.addProperty("key2", "value2");

        // Print the JsonObject
        System.out.println(jsonObject);

        // Get a value from the JsonObject
        String value = jsonObject.get("key1").getAsString();
        System.out.println("Value for 'key1': " + value);
    }
}