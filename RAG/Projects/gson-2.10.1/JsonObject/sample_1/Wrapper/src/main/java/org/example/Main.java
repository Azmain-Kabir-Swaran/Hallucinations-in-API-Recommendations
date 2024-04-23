package org.example;


import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();
        
        jsonObject.addProperty("Name", "John");
        jsonObject.addProperty("Age", 25);
        jsonObject.addProperty("Address", "12345 Sunny Street");
        
        System.out.println(jsonObject.toString());
    }
}