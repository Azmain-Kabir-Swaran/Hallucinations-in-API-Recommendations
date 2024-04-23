package org.example;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxmlckage com.fasterxml.jackson.databind.node.JsonNodeFactory;

public class Main {

    public static void main(String[] args) {
        // Create a new JsonNodeFactory
        JsonNodeFactory factory = JsonNodeFactory.instance;

        // Create a new JsonNode
        JsonNode node = factory.objectNode()
            .put("name", "John")
            .put("age", 30)
            .put("city", "New York");

        System.out.println(node.toPrettyString());
    }
}