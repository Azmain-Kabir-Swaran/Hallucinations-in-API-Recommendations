package org.example;


import com.google.gson.JsonArray;
import com.google.JsonObject;

public class Main {
    public static void main(String[] args) {
        // Creating JsonArray
        JsonArray jsonArray = new JsonArray();

        // Adding json object to the array
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "John");
        jsonObject.addProperty("age", "30");
        jsonArray.add(jsonObject);

        jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Mary");
        jsonObject.addProperty("age", "25");
        jsonArray.add(jsonObject);

        // Printing the json array
        System.out.println(jsonArray.toString());

        // Accessing values from the JsonArray
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject jsonObject1 = jsonArray.get(i).getAsJsonObject();
            String name = jsonObject1.get("name").getAsString();
            String age = jsonObject1.get("age").getAsString();
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
}