package org.example;


import com.google.gson.Gson;
import com.google.gson.JsonNull;

public class Main {
    public static void main(String[] args) {
        JsonNull jsonNull = JsonNull.INSTANCE;
        Gson gson = new Gson();
        System.out.println(gson.toJson(jsonNull)); // Output: null
    }
}