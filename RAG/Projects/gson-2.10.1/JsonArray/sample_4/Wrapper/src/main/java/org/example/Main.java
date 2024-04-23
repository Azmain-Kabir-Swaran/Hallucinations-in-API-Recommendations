package org.example;


import com.google.gson.JsonArray;

public class Main {
    public static void main(String[] args) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add("Element 1");
        jsonArray.add("Element 2");
        jsonArray.add("Element 3");

        for (int i = 0; i < jsonArray.size(); i++) {
            System.out.println(jsonArray.get(i));
        }
    }
}