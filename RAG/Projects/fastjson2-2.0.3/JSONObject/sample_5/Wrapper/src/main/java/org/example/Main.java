package org.example;


import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;

public class Main {

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "John Doe");
        jsonObject.put("age", 30);
        System.out.println(jsonObject); // Output: {"age":30,"name":"John Doe"}
        
        String jsonString = jsonObject.toJSONString();
        JSONObject jsonObjectFromString = JSON.parseObject(jsonString);
        System.out.println(jsonObjectFromString); // Output: {"age":30,"name":"John Doe"}
    }
}