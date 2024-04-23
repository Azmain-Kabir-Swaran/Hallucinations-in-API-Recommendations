package org.example;


import com.alibaba.fastjson2.JSONObject;

public class Main {
    public static void main(String[] args) {
        // creating a new JSONObject
        JSONObject jsonObject = new JSONObject();

        // adding key-value pairs to the JSONObject
        jsonObject.put("key1", "value1");
        jsonObject.put("key2", 2);

        // printing the JSONObject
        System.out.println(jsonObject);
    }
}