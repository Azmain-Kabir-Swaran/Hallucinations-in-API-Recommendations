package org.example;


import com.google.gson.JsonPrimitive;

public class Main {
    public static void main(String[] args) {
        JsonPrimitive jsonPrimitive = new JsonPrimitive(123); 
        System.out.println(jsonPrimitive);
    }
}