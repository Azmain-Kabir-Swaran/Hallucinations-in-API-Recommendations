package org.example;


import org.apache.commons.text.StringSubstitutor;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> valuesMap = new HashMap<String, String>();
        valuesMap.put("name", "World");
        String text = "Hello, ${name}";
        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        String output = sub.replace(text);
        System.out.println(output);
    }
}