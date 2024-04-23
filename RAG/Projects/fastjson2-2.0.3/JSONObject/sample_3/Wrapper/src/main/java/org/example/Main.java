package org.example;


import com.alibaba.fastjson2.JSONObject;

public class Main {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        JSONObject jsonObject = JSONObject.parseObject(json);

        System.out.println(jsonObject.getString("name")); // Outputs "John"
        System.out  .println(jsonObject.getIntValue("age")); // Outputs 30
        System.out.println(jsonObject.getString("city")); // Outputs "New York"
    }
}