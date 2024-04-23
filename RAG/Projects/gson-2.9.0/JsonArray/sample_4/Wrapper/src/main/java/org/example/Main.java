package org.example;


import com.google.gson.JsonArray;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add("hello");
        jsonArray.add("world");

        Gson gson = new Gson();
        List<String> list = gson.fromJson(jsonArray, new ArrayList<String>().getClass());

        System.out.println(list); // Output: [hello, world]
    }
}