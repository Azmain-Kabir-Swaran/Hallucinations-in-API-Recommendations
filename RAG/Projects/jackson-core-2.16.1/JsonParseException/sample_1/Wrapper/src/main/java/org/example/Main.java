package org.example;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxmljackson.core.JsonFactory;

public class Main {
    public static void main(String[] args) throws JsonParseException {

        JsonFactory factory = new JsonFactory();
        JsonParseException exception = new JsonParseException("Sample error message");

        // You can throw an exception or handle it as needed for your application.
        // throw exception;
    }
}