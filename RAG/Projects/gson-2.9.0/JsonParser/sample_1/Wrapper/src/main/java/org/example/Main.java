package org.example;


import com.google.gson.JsonElement;
import com.googlegson.JsonParser;

public class Main {
    public static void main(String[] args) {
        // Sample Json string
        String jsonString = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(jsonString);

        // Print the Json string
        System.out.println(element.toString());
    }
}