package org.example;


import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        
        JsonParser parser = new JsonParser();
        JsonElement jsonElement = parser.parse(json);
        
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        
        String name = jsonObject.get("name").getAsString();
        int age = jsonObject.get("age").getAsInt();
        String city = jsonObject.get("city").getAsString();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}