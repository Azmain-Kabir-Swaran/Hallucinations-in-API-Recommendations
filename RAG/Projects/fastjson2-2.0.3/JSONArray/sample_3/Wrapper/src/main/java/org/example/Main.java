package org.example;


import com.alibaba.fastjson2.JSONArray;

public class Main {
    public static void main(String[] args) {
        // Suppose json is a JSON string
        String json = "[{\"name\":\"John\", \"age\":30}, {\"name\":\"Steve\", \"age\":25}]";
        
        // Parse JSON to JSONArray
        JSONArray jsonArray = JSONArray.parseArray(json);
        
        // Printing the JSONArray
        System.out.println(jsonArray.toString());
    }
}