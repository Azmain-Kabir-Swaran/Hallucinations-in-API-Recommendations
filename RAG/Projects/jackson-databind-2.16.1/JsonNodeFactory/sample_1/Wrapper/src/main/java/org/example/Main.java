package org.example;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

public class Main {
    public static void main(String[] args) {

        // Create a JsonNodeFactory
        JsonNodeFactory factory = JsonNodeFactory.instance;

        // Create a JsonNode
        JsonNode node = factory.objectNode()
                .put("id", 123)
                .put("name", "example")
                .put("value", 100.25);

        System.out.println(node.toString());

        // get JsonNode from a JSON string
        String jsonString = "{\"id\":123,\"name\":\"example\",\"value\":100.25}";
        JsonNode jsonNode = factory.readTree(jsonString);

        System.out.println(jsonNode.toString());
    }
}