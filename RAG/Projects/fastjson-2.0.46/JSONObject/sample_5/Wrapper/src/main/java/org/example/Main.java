package org.example;


import com.alibaba.fastjson.JSONObject;

public class Main {
    public static void main(String[] args) {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("name", "Tom");
        jsonObj.put("age", 25);
        jsonObj.put("country", "USA");

        System.out.println(jsonObj.toJSONString());
    }
}