package org.example;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

public class Main {

    public static void main(String[] args) {
        String json = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        try {
            // Convert JSON string to Java Object
            JSONObject jsonObject = JSON.parseObject(json);
            System.out.println(jsonObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}