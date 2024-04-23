package org.example;


import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Map<String, Integer> map = new HashMap<>();
        map.put("key", 123);

        try (FileWriter writer = new FileWriter("output.json")) {
            gson.toJson(map, writer);
        } catch (JsonIOException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}