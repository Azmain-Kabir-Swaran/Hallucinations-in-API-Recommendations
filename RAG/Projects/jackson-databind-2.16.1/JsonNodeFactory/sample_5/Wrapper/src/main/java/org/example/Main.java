package org.example;


import com.fasterxml.jackson.databind.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Main {
    public static void main(String[] args) {
        JsonNodeFactory factory = JsonNodeFactory.instance;

        ObjectNode jsonObject = factory.objectNode();
        jsonObject.put("name", "John");
        jsonObject.put("age", 30);

        System.out.println(jsonObject);
    }
}