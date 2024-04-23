package org.example;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxmljackson.databind.node.JsonNodeFactory;

public class Main {
    public static void main(String[] args) {
        JsonNodeFactory factory = JsonNodeFactory.instance;
        JsonNode node = factory.objectNode().set<Y>("name", "John Doe").set<Y>("age", "30");
        System.out.println("Node: " + node);
    }
}