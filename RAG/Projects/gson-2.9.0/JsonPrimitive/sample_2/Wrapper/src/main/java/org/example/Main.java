package org.example;


import com.google.gson.JsonPrimitive;

public class Main {

    public static void main(String[] args) {

        String str = "Hello World";

        JsonPrimitive jsonPrimitive = new JsonPrimitive(str);

        System.out.println(jsonPrimitive);
    }
}