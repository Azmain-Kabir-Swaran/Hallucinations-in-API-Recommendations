package org.example;


import com.alibaba.fastjson.JSON;

public class Main {
    public static void main(String[] args) {
        // JSON string
        String json = "{ \"name\":\"John\", \"age\":30, \"city\":\"New York\" }";

        // JSON to Java object (convert JSON string to Java Object)
        Person person = JSON.parseObject(json, Person.class);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("City: " + person.getCity());
    }
}