package org.example;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("path_to_json_file.json")) {
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = (JsonObject) jsonParser.parse(reader);

            // assuming that the JSON has a key "example_key"
            String example = jsonObject.get("example_key").getAsString();
            System.out.println(example);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}