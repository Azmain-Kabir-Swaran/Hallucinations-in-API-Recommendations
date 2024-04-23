package org.example;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        JsonArray jsonArray = new JsonArray();

        // Creating Json Object
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("name", "Alice");
        jsonObject1.addProperty("age", 25);

        // Adding Json Object to Json Array
        jsonArray.add(jsonObject1);

        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("name", "Bob");
        jsonObject2.addProperty("age", 30);

        // Adding Json Object to Json Array
        jsonArray.add(jsonObject2);

        // Printing the Json Array
        System.out.println(jsonArray);
    }
}