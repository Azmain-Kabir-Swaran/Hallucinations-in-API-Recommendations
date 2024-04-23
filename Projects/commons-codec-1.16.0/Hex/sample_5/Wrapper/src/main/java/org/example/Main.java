package org.example;


import org.apache.commons.codec.binary.Hex;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws Exception {
        String message = "Hello World!";
        byte[] messageBytes = message.getBytes(StandardCharsets.UTF_8);
        String hexValue = Hex.encodeHexString(messageBytes);

        System.out.println("Hex representation of the string: " + hexValue);

        // For json parsing example
        String json = "{\"name\": \"John\", \"age\": 30, \"city\": \"New York\"}";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(json);
        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

        System.out.println("Parsed JSON: " + jsonString);
    }
}