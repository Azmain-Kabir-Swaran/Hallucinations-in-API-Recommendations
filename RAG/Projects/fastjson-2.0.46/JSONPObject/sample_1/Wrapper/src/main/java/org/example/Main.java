package org.example;


import com.alibaba.fastjson.JSONPObject;

public class Main {
    public static void main(String[] args) {
        JSONPObject jsonObject = new JSONPObject("name", "John");
        jsonObject.put("age", 30);
        jsonObject.put("city", "New York");

        String jsonString = jsonObject.toJSONString();

        System.out.println("JSON String :" + jsonString);

        JSONPObject parsedJsonObject = JSONPObject.parseObject(jsonString);
        System.out.println("Parsed JSON Object: " + parsedJsonObject);
    }
}