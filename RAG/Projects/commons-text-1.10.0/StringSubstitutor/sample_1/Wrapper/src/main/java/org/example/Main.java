package org.example;


import java.util.HashMap;
import org.apache.commons.text.StringSubstitutor;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> valuesMap = new HashMap<String, String>();
        valuesMap.put("name", "John Doe");
        valuesMap.put("occupation", "Programmer");

        String template = "${name} is a ${occupation}.";

        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        String resolvedString = sub.replace(template);

        System.out.println(resolvedString); // Output: "John Doe is a Programmer."
    }
}