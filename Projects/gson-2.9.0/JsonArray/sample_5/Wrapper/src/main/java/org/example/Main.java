package org.example;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {
    public static void main(String[] args) {
        JsonParser parser = new JsonParser();
        String json = "[1, 2, 3, 4, 5]";
        JsonArray jsonArray = parser.parse(json).getAsJsonArray();

        for (int i = 0; i < jsonArray.size(); i++) {
            System.out.println(jsonArray.get(i).getAsInt());
        }
    }
}