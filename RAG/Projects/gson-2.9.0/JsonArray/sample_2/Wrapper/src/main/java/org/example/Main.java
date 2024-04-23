package org.example;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Main {
  public static void main(String[] args) {
    // Create a new JsonArray
    JsonArray jsonArray = new JsonArray();

    // Add elements to the JsonArray
    jsonArray.add("Element1");
    jsonArray.add("Element2");
    jsonArray.add("Element3");

    // Print the JsonArray
    System.out.println(jsonArray.toString());

    // Retrieve and print elements from the JsonArray
    for (int i = 0; i < jsonArray.size(); i++) {
      System.out.println(jsonArray.get(i));
    }

    // Parse a JSON array
    String jsonString = "[{\"name\":\"John\", \"age\":30}, {\"name\":\"Jane\", \"age\":26}]";
    JsonArray jsonArray2 = new JsonArray(jsonString);

    // Print the parsed JsonArray
    System.out.println(jsonArray2.toString());
  }
}