package org.example;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.lang3.StringUtils;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        String jsonString = "[{\"name\":\"John\"}, {\"name\":\"Jane\"}, {\"name\":\"Doe\"}]";
        JsonParser parser = new JsonParser();
        JsonArray jsonArray = parser.parse(jsonString).getAsJsonArray();
        
        Iterator<JsonElement> iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JsonObject jsonObject = iterator.next().getAsJsonObject();
            String name = jsonObject.get("name").getAsString();
            System.out.println(StringUtils.capitalize(name));
        }
    }
}