package org.example;


import com.google.gson.Gson;
import com.google.gson.JsonNull;

public class Main {

    public static void main(String[] args) {
        // Create a JsonNull object
        JsonNull nullJson = JsonNull.INSTANCE;

        // Create a new Gson object
        Gson gson = new Gson();

        // Serialize the JsonNull object to a JSON string
        String nullJsonString = gson.toJson(nullJson);

        // Print the serialized JSON string
        System.out.println(nullJsonString);
    }
}