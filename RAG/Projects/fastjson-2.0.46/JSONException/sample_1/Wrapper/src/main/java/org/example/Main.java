package org.example;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class Main {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";

        try {
            Person person = JSON.parseObject(json, Person.class);
            System.out.println(person);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}