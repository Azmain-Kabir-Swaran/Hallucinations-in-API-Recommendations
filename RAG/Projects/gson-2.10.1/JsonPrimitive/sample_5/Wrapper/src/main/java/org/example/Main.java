package org.example;


import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Main {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();

        // Add properties to JsonObject
        jsonObject.add("name", new JsonPrimitive("John Doe"));
        jsonObject.add("age", new JsonPrimitive(30));

        System.out.println(jsonObject);
    }
}