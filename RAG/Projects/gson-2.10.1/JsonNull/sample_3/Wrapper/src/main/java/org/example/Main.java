package org.example;


import com.google.gson.JsonNull;
import com.google.gson.JsonElement;

public class Main {
    public static void main(String[] args) {
        JsonElement myElement = JsonNull.INSTANCE;
        System.out.println(myElement);
    }
}