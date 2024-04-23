package org.example;


import com.alibaba.fastjson.JSONObject;

public class Main {
    public static void main(String[] args) {
        // Create a JSONObject
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key", "value");

        // Print the JSONObject to the console
        System.out.println(jsonObject.toString());
    }
}