package org.example;


import org.apache.commons.text.RandomStringGenerator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String randomString = "";
        
        RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('0', 'z').filteredBy(CharacterPredicates.DIGITS, CharacterPredicates.LETTERS).build();
        randomString = generator.generate(length);
        
        System.out.println(randomString);
    }
}