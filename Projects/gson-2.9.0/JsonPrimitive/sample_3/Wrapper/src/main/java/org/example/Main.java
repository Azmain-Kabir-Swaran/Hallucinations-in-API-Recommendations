package org.example;


import com.google.gson.JsonPrimitive;

public class Main {
    public static void main(String[] args) {
        JsonPrimitive json = new JsonPrimitive(12345);
        System.out.println(json); // Prints: 12345
    }
}