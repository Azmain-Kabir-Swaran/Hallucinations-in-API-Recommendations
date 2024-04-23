package org.example;

import com.fasterxml.jackson.core.JsonFactory;

public class Main {

    public static void main(String args[]) throws Exception {

        JsonFactory factory = new JsonFactory();

        // Create JSON object
        String jsonString = "{ \"name\": \"John\", \"age\":30,\"city\": \"New York\"}";
        JsonNode rootNode = factory.getCodec().readTree(jsonString);

        System.out.println("JSON as Java Object:");
        // Display JSON object
        System.out.println("Name: " + rootNode.get("name").asText());
        System.out.println("Age: " + rootNode.get("age").asInt());
        System.out.println("City: " + rootNode.get("city").asText());

        // Convert Java Object back to JSON
        String newJsonString = factory.getCodec().writeValueAsString(rootNode);

        System.out.println("\nJSON String from Java Object:");
        System.out.println(newJsonString);
    }
}