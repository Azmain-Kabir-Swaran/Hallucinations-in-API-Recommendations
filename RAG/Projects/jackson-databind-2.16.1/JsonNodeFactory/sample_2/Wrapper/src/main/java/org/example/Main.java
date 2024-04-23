package org.example;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

public class Main {

    public static void main(String[] args) {
        JsonNodeFactory factory = JsonNodeFactory.instance;

        JsonNode rootNode = factory.objectNode().put("key", "value");

        System.out.println(rootNode.toString());
    }
}