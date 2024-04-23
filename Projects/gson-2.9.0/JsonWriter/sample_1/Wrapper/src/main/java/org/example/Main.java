package org.example;


import com.google.gson.stream.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileName = "JsonOutput.json";
        try (FileWriter writer = new FileWriter(fileName);
             JsonWriter jsonWriter = new JsonWriter(writer)) {

            // Starting the document
            jsonWriter.beginObject();
            // Write name value
            jsonWriter.name("name");
            jsonWriter.value("John Doe");

            // Write address object
            jsonWriter.name("address");
            jsonWriter.beginObject();

            // Write street and number
            jsonWriter.name("street");
            jsonWriter.value("123 Main St");
            jsonWriter.name("number");
            jsonWriter.value(123);

            // Closing the address object
            jsonWriter.endObject();

            // Closing the document
            jsonWriter.endObject();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}