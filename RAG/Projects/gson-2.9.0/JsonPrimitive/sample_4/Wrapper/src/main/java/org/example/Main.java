package org.example;


import com.google.gson.JsonPrimitive;

public class Main {
    public static void main(String[] args) {
        JsonPrimitive primitive = new JsonPrimitive(true);
        System.out.println("Is JsonPrimitive instance true?: " + primitive.getAsBoolean());

        JsonPrimitive primitive2 = new JsonPrimitive("Hello, World!");
        System.out.println("Is JsonPrimitive instance string?: " + primitive2.getAsString());

        JsonPrimitive primitive3 = new JsonPrimitive(123);
        System.out.println("Is JsonPrimitive instance integer?: " + primitive3.getAsInt());
    }
}