package org.example;


import com.google.gson.JsonObject;

public class Main {
  public static void main(String[] args) {
    // Create a JsonObject
    JsonObject jsonObject = new JsonObject();
    // Add a property
    jsonObject.addProperty("name", "John");
    // Add another property
    jsonObject.addProperty("age", 30);
    // Print the JsonObject
    System.out.println(jsonObject);
  }
}