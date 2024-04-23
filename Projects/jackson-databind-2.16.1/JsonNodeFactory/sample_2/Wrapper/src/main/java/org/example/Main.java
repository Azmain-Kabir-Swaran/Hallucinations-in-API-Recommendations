package org.example;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

public class Main {
    public static void main(String[] args) {
        JsonNodeFactory factory = JsonNodeFactory.instance;
        JsonNode node = factory.objectNode()
                    .put("Name", "John Doe")
                    .put("age", 30)
                    .put("city", "New York");
        System.out.println(node.toPrettyString());
    }
}