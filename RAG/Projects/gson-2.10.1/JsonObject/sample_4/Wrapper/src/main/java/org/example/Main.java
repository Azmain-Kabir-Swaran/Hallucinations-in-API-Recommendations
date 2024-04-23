package org.example;


import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        // Creating JsonObject
        JsonObject jsonObject = new JsonObject();
        
        // Adding values to json object
        jsonObject.addProperty("name", "John");
        jsonObject.addProperty("age", 25);

        // Printing json object to the console
        System.out.println(jsonObject);
    }
}