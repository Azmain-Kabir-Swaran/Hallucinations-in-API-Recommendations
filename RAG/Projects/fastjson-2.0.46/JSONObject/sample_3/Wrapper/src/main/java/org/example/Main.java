package org.example;


import com.alibaba.fastjson.JSONObject;

public class Main {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("name", "John Doe");
        obj.put("age", 25);
        System.out.println(obj.toString());
    }
}