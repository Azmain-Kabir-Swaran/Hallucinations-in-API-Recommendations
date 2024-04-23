package org.example;


import org.apache.commons.text.RandomStringGenerator;
import org.apache.commons.lang3.RandomUtils;

public class Main {
    public static void main(String[] args) {
        RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('0', 'z').filteredBy(CharacterPredicate.ASCII_PRINTABLE).build();
        int length = RandomUtils.nextInt(1, 10); // random length from 1 to 10
        String randomStr = generator.generate(length);
        System.out.println(randomStr);
    }
}