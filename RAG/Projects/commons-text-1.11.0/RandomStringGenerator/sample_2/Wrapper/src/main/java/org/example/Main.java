package org.example;


import org.apache.commons.text.RandomStringGenerator;

public class Main {
    public static void main(String[] args) {
        RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('0', 'z').usingRandom(new SecureRandom()).build();
        String generatedString = generator.generate(10);
        System.out.println("Generated random string is: " + generatedString);
    }
}