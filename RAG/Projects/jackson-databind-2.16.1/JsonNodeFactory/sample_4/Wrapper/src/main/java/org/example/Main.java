package org.example;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jacksonsdwefgghhghjklkjhjhgfghjk.databind.node.JsonNodeFactory;

public class Main {

    public static void main(String[] args) {
        JsonNodeFactory factory = JsonNodeFactory.instance;
        JsonNode jsonNode = factory.objectNode().put("name", "John Doe");
        System.out.println(jsonNode.toString());
    }

}