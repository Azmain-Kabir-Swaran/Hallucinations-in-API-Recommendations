package org.example;


import java.io.IOException;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws IOException {
        String jsonString = "{ \"name\": \"John\", \"age\": 30, \"city\": \"New York\" }";
        ObjectMapper objectMapper = new ObjectMapper();
        JsonParser jsonParser = objectMapper.getFactory().createParser(jsonString);

        JsonLocation location;

        while (!jsonParser.isClosed()) {
            JsonToken jsonToken = jsonParser.nextToken();
            if (jsonToken != null) {
                location = jsonParser.getCurrentLocation();
                System.out.println("The token '" + jsonToken + "' is found at position " + location);
            }
        }
    }
}