package org.example;


import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Main {
    public static void main(String[] args) {
        // Create a JsonObject
        JsonObject jsonObject = new JsonObject();
        
        // Add a string value to the object
        jsonObject.add("key1", new JsonPrimitive("value1"));

        // Add an integer value to the object
        jsonObject.addProperty("key2", 2);
        
        // Now the jsonObject object should look like this: {"key1": "value1", "key2": 2}
        
        // You can now print the JSON String
        System.out.println(jsonObject.toString());
    }
}