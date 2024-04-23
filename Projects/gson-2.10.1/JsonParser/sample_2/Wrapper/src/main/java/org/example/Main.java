package org.example;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {
  public static void main(String[] args) {
    String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
    JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
    System.out.println("Name: " + jsonObject.get("name").getAsString());
    System.out.println("Age: " + jsonObject.get("age").getAsInt());
    System.out.println("City: " + jsonObject.get("city").getAsString());
  }
}