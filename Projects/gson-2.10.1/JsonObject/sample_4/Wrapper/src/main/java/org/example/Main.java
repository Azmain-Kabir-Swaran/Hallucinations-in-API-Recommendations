package org.example;


import com.google.gson.JsonObject;

public class Main {

  public static void main(String[] args) {
    // Create a JsonObject
    JsonObject jsonObject = new JsonObject();
    
    // Add properties to JsonObject
    jsonObject.addProperty("key", "value");
    
    // Retrieve value from JsonObject
    String value = jsonObject.get("key").getAsString();
    
    System.out.println(value);  // This will print "value"
  }

}