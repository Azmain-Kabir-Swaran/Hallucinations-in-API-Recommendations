package org.example;


import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();
        
        jsonObject.addProperty("name", "John");
        jsonObject.addProperty("age", 30);
        
        System.out.println(jsonObject.toString());
    }
}