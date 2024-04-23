package org.example;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String jsonString = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(jsonString);

        JsonNode nameNode = rootNode.path("name");
        String name = nameNode.asText();
        System.out.println("Name: " + name);

        JsonNode ageNode = rootNode.path("age");
        int age = ageNode.asInt();
        System.out.println("Age: " + age);

        JsonNode cityNode = rootNode.path("city");
        String city = cityNode.asText();
        System.out.println("City: " + city);
    }
}