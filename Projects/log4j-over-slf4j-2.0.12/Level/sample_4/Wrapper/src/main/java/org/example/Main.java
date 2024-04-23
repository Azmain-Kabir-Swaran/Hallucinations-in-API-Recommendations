package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.common.collect.Lists;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        logger.info("Starting application...");

        try {
            // Guava usage
            System.out.println("Guava list: " + Lists.newArrayList("a", "b", "c"));

            // Jackson usage
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString("Hello, world!");
            System.out.println("JSON String: " + json);
        } catch (JsonProcessingException e) {
            logger.error("An error occurred while processing the JSON", e);
        }

        logger.info("Application finished.");
    }
}