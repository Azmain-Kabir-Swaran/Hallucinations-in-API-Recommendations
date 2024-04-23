package org.example;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        JsonArray jsonArray = new JsonArray();

        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("name", "John");
        jsonObject1.addProperty("age", "25");
        jsonArray.add(jsonObject1);

        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("name", "Jane");
        jsonObject2.addProperty("age", "30");
        jsonArray.add(jsonObject2);

        // Print out the JsonArray
        for(int i = 0; i < jsonArray.size(); i++) {
            JsonObject object = jsonArray.get(i).getAsJsonObject();
            System.out.println("Name: " + object.get("name").getAsString());
            System.out.println("Age: " + object.get("age").getAsString());
        }
    }
}