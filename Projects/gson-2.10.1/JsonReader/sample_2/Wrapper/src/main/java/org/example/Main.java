package org.example;


import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // Let's assume that we have a JSON string.
        String json = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";

        // Create a JsonParser object.
        JsonParser parser = new JsonParser();

        // Create a JsonReader object.
        JsonReader reader = new JsonReader(new InputStreamReader(new InputStream() {

            @Override
            public int read() {
                return json.charAt(0);
            }

            @Override
            public int read(char[] b, int off, int len) {
                return json.charAt(0);
            }

            @Override
            public int read(char[] b) {
                return json.charAt(0);
            }

            @Override
            public long skip(long n) {
                return 1;
            }

            @Override
            public boolean ready() {
                return false;
            }

            @Override
            public void mark(int readAheadLimit) {
            }

            @Override
            public void reset() {
            }

            @Override
            public boolean markSupported() {
                return false;
            }
        }));

        // Parse the JSON string to a JsonElement.
        JsonElement jsonElement = parser.parse(reader);

        // Process the JsonElement.
        System.out.println(jsonElement);
    }
}