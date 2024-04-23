package org.example;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import java.io.*;

public class Main {
    public static void main(String[] args) throws JsonParseException, IOException {
        JsonFactory factory = new JsonFactory();
        String json = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        try {
            com.fasterxml.jackson.databind.JsonNode node = factory.getCodec().readTree(json);
        } catch (JsonParseException e) {
            System.out.println("Invalid JSON");
        }
    }
}