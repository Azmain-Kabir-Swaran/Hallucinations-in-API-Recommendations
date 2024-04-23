package org.example;


import com.google.gson.JsonParser;

public class Main {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JsonParser parser = new JsonParser();
        com.google.gson.JsonElement jsonElement = parser.parse(json);
        com.google.gson.JsonObject jsonObject = jsonElement.getAsJsonObject();

        String name = jsonObject.get("name").getAsString();
        int age = jsonObject.get("age").getAsInt();
        String city = jsonObject.get("city").getAsString();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}