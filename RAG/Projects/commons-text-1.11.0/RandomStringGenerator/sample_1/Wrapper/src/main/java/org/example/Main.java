package org.example;


import org.apache.commons.text.CharacterUtils;
import org.apache.commons.text.RandomStringGenerator;

public class Main {
    public static void main(String[] args) {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
            .withinRange('0', 'z')
            .filteredBy(CharacterUtils::isAsciiPrintable)
            .build();

        String randomString = generator.generate(10);

        System.out.println("Random String is: " + randomString);
    }
}