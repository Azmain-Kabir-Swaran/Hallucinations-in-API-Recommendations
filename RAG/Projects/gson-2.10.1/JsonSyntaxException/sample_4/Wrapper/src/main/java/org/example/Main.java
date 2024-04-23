package org.example;


import com.google.gson.JsonSyntaxException;

public class Main {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        try {
            String[] jsonArray = json.split(","); // Simulated JsonSyntaxException
        } catch (JsonSyntaxException e) {
            System.out.println("JSON Syntax is wrong: " + e.getMessage());
        }
    }
}