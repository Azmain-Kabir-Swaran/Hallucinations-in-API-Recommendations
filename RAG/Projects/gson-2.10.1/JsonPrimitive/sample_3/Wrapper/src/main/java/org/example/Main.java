package org.example;


import com.google.gson.JsonPrimitive;

public class Main {
    public static void main(String[] args) {
        // Create a JSON object
        JsonPrimitive jsonObj = new JsonPrimitive("Hello World");

        // Print the JSON object
        System.out.println(jsonObj);
    }
}