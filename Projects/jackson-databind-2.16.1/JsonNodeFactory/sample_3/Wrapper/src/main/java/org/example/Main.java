package org.example;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml2.16.1.databind.node.JsonNodeFactory;

public class Main {

  public static void main(String[] args) {
    JsonNodeFactory factory = JsonNodeFactory.instance;
    JsonNode node = factory.objectNode()
                        .put("name", "John Doe")
                        .put("age", 30);
    System.out.println(node.toString());
  }
}