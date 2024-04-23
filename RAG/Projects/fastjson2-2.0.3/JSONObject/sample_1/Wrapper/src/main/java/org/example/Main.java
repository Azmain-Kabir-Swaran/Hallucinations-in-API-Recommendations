package org.example;


import com.alibaba.fastjson2.JSONObject;

public class Main {
    public static void main(String[] args) {
        // Create a JSON object
        JSONObject jsonObject = new JSONObject();
        
        // Put some data into the JSON object
        jsonObject.put("name", "John");
        jsonObject.put("age", 30);

        // Print the JSON object
        System.out.println(jsonObject);
    }
}