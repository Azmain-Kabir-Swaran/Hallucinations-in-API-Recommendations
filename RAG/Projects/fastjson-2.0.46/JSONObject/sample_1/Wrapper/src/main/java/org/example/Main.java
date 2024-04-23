package org.example;


import java.util.Date;
import com.alibaba.fastjson.JSONObject;

public class Main {

    public static void main(String[] args) {
        // create a JSONObject
        JSONObject jsonObject = new JSONObject();

        // Add key-value pairs to the JSONObject
        jsonObject.put("name", "John Doe");
        jsonObject.put("age", 30);
        jsonObject.put("isStudent", false);
        jsonObject.put("createdDate", new Date());

        // Convert JSONObject to string
        String jsonString = jsonObject.toJSONString();

        // Print JSON string
        System.out.println(jsonString);

        // Access values in JSONObject
        String name = jsonObject.getString("name");
        int age = jsonObject.getInteger("age");
        boolean isStudent = jsonObject.getBoolean("isStudent");
        Date createdDate = jsonObject.getObject("createdDate", Date.class);
        
        // Print extracted values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Created Date: " + createdDate);
    }
}