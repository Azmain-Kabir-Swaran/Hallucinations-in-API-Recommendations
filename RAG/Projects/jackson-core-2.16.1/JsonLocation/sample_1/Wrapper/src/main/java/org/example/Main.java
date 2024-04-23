package org.example;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        // Create a JSON object
        ObjectNode jsonObject = mapper.createObjectNode();
        jsonObject.put("name", "John");
        jsonObject.put("age", 25);

        // Convert the object to JSON string
        String jsonString = "";
        try {
            jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(jsonString);

        // Convert the JSON string back to an object
        ObjectNode jsonNode = null;
        try {
            jsonNode = (ObjectNode) mapper.readTree(jsonString);
            System.out.println("Name: " + jsonNode.get("name").asText());
            System.out.println("Age: " + jsonNode.get("age").asInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}