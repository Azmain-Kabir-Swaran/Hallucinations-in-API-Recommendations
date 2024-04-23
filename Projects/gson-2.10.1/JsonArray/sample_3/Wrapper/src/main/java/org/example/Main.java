package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {
    public static void main(String[] args) {
        // Here is your JSON object.
        String json = "{\"array\": [\"one\", \"two\", \"three\"]}";

        // Parse the JSON string into a JsonObject.
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

        // Get the "array" element from the parsed JSON.
        JsonArray array = jsonObject.get("array").getAsJsonArray();

        // Convert JsonArray to a List.
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            list.add(array.get(i).getAsString());
        }

        // Print the List.
        System.out.println(Arrays.toString(list.toArray()));
    }
}