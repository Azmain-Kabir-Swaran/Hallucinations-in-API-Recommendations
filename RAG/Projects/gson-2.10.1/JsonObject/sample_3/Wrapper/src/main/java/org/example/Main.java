package org.example;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "John");
        jsonObject.addProperty("age", 30);

        JsonArray array = new JsonArray();
        array.add("Apple");
        array.add("Banana");

        jsonObject.add("FavoriteFruit", array);

        System.out.println(jsonObject);
    }
}