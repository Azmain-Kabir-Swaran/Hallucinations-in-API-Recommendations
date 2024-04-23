package org.example;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

  public static void main(String[] args) {
    // Creating ObjectMapper instance
    ObjectMapper objectMapper = new ObjectMapper();

    // Creating JsonNodeFactory instance
    JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(objectMapper.getNodeFactory());

    // Parsing JSON String to JsonNode
    JsonNode jsonNode = jsonNodeFactory.textNode("{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}");

    System.out.println(jsonNode);
  }
}