package org.example;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {
    public static void main(String[] args) {
        String json = "{ \"key\": \"value\" }";
        JsonParser parser = new JsonParser();
        JsonObject obj = parser.parse(json).getAsJsonObject();

        System.out.println("The key's value: " + obj.get("key").getAsString());
    }
}