package org.example;


import org.apache.commons.text.StringSubstitutor;

public class Main {
    public static void main(String[] args) {
        String template = "Hello, ${name}! Your current balance is ${balance}.";
        StringSubstitutor sub = new StringSubstitutor(
            new StringSubstitutor.MapResolver() {
                @Override
                public String apply(String key) {
                    switch (key) {
                        case "name": return "John Doe";
                        case "balance": return "1000";
                        default: return "?";
                    }
                }
            });
        System.out.println(sub.replace(template));
    }
}