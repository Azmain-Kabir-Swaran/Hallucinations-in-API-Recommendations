package org.example;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {
    public static void main(String[] args) {
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse("{ \"key\": \"value\" }").getAsJsonObject();
        System.out.println(jsonObject.get("key"));
    }
}