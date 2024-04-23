package org.example;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONException;

public class Main {
    public static void main(String[] args) {
        // Create JSON String
        String jsonString = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";

        // Parse the JSON String and create a JSON Object
        try {
            JSONObject jsonObject = JSONObject.parseObject(jsonString);

            // Access the data inside the JSON Object
            String name = jsonObject.getString("name");
            int age = jsonObject.getInteger("age");
            String city = jsonObject.getString("city");

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}