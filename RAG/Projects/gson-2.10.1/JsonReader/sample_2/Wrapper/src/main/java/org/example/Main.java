package org.example;


import com.google.gson.JsonReader;
import com.google.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.StringReader;

public class Main {

    public static void main(String[] args) {
        String json = "{\"key\":\"value\"}";
        JsonReader jsonReader = new JsonReader(new StringReader(json));
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String key = jsonReader.nextName();
            if (jsonReader.peek() == JsonToken.NAME) {
                String value = jsonReader.nextString();
                System.out.println("Key: " + key + ", Value: " + value);
            }
        }
        jsonReader.endObject();
        jsonReader.close();
    }
}