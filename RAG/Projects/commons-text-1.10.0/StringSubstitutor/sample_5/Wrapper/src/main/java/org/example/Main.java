package org.example;


import org.apache.commons.text.StringSubstitutor;
import org.apache.commons.text.WordUtils;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String text = "Hello, ${name}!";
        Map<String, String> valuesMap = new HashMap<String, String>();
        valuesMap.put("name", "World");

        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        String output = sub.replace(text);

        System.out.println(output);
    }
}