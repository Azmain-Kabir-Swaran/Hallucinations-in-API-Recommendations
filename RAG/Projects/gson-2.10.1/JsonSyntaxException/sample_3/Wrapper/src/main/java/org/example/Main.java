package org.example;


import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String json = "{name:\"John\", age:30, city:\"New York\"}";
        JsonParser parser = new JsonParser();
        try {
            JsonObject obj = parser.parse(json).getAsJsonObject();
            String name = obj.get("name").getAsString();
            int age = obj.get("age").getAsInt();
            String city = obj.get("city").getAsString();
            System.out.println(name + ", " + age + ", " + city);
        } catch (JsonSyntaxException e) {
            System.out.println("JSON syntax error: " + e.getMessage());
        }
    }
}