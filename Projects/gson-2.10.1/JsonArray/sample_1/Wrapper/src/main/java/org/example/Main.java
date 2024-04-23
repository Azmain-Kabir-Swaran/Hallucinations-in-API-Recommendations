package org.example;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add("element1");
        jsonArray.add("element2");
        jsonArray.add("element3");

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "John");
        jsonObject.add("data", jsonArray);

        Gson gson = new Gson();
        String json = gson.toJson(jsonObject);
        System.out.println(json);

        JsonObject jsonObjectFromJson = gson.fromJson(json, JsonObject.class);
        JsonArray dataArray = jsonObjectFromJson.getAsJsonArray("data");
        for (JsonElement element : dataArray) {
            System.out.println(element.getAsString());
        }
    }
}