package org.example;


import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Main {
    public static void main(String[] args) {
        // create a new JsonPrimitive
        JsonPrimitive jsonPrimitive = new JsonPrimitive(123);

        // create a new JsonObject
        JsonObject jsonObject = new JsonObject();

        // set the JsonPrimitive to a JsonObject
        jsonObject.add("myNumber", jsonPrimitive);

        // print the JsonObject
        System.out.println(jsonObject.toString());
    }
}