package org.example;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {
    public static void main(String[] args) {
        JsonParser parser = new JsonParser();
        JsonElement jsonElement = parser.parse("{ \"key1\": \"value1\", \"key2\": \"value2\" }");
        JsonObject jsonObject = jsonElement.getAsJsonObject();

        String value1 = jsonObject.get("key1").getAsString();
        System.out.println("Value 1: " + value1);

        String value2 = jsonObject.get("key2").getAsString();
        System.out.println("Value 2: " + value2);
    }
}