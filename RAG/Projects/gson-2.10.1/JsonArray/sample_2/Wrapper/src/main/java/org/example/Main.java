package org.example;


import com.google.gson.Gson;
import com.google.gson.JsonArray;

class Main {
  public static void main(String[] args) {
    // Create a new Gson instance
    Gson gson = new Gson();

    // Create a new JsonArray
    JsonArray jsonArray = new JsonArray();

    // Add elements to the JsonArray
    jsonArray.add("element1");
    jsonArray.add("element2");
    jsonArray.add("element3");

    // Convert JsonArray to a String
    String jsonArrayString = jsonArray.toString();
    System.out.println("JsonArray String: " + jsonArrayString);

    // Convert JsonArray back to a List of Strings
    List<String> list = gson.fromJson(jsonArrayString, new TypeToken<List<String>>() {}.getType());
    System.out.println("List: " + list);
  }
}