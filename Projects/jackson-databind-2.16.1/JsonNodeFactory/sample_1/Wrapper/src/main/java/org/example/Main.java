package org.example;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxmlNodeFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        // Create an instance of JsonNodeFactory
        JsonNodeFactory jsonNodeFactory = JsonNodeFactory.instance;

        // Create a JSON object with the key-value pairs using JsonNodeFactory
        JsonNode jsonNode = jsonNodeFactory.objectNode()
                .put("name", "John Doe")
                .put("age", 30)
                .put("city", "New York");

        // Convert the JsonNode to a JSON string
        String jsonString = new ObjectMapper().writeValueAsString(jsonNode);

        // Print the JSON string
        System.out.println(jsonString);
    }
}