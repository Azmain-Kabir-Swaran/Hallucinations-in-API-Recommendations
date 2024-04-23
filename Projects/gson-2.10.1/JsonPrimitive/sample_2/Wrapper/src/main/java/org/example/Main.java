package org.example;


import com.google.gson.JsonPrimitive;

public class Main {
    public static void main(String[] args) {
        // Creating JsonPrimitive instances
        JsonPrimitive jsonPrimitive1 = new JsonPrimitive("Hello, World!");
        JsonPrimitive jsonPrimitive2 = new JsonPrimitive(123);
        JsonPrimitive jsonPrimitive3 = new JsonPrimitive(true);

        // Accessing values
        System.out.println("JsonPrimitive 1: " + jsonPrimitive1);
        System.out.println("JsonPrimitive 2: " + jsonPrimitive2);
        System.out.println("JsonPrimitive 3: " + jsonPrimitive3);

        // Is it primitive? It should be true for JsonPrimitive
        System.out.println("Is JsonPrimitive 1 primitive? " + jsonPrimitive1.isPrimitive());
        System.out.println("Is JsonPrimitive 2 primitive? " + jsonPrimitive2.isPrimitive());
        System.out.println("Is JsonPrimitive 3 primitive? " + jsonPrimitive3.isPrimitive());
    }
}