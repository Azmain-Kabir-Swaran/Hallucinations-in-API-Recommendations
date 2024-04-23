package org.example;


import com.alibaba.fastjson.JSONObject;

public class Main {
    public static void main(String[] args) {
        // Create JSONObject from JSON string
        JSONObject jsonObject = new JSONObject("{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}");

        // Access values from JSONObject
        String name = jsonObject.getString("name");
        Integer age = jsonObject.getInteger("age");
        String city = jsonObject.getString("city");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        // Change values
        jsonObject.put("name", "Jane");
        jsonObject.put("age", 28);

        System.out.println("New JSON Object: " + jsonObject.toJSONString());
    }
}