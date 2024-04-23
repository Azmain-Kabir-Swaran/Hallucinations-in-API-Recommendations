package org.example;


import org.apache.commons.io.IOCase;

public class Main {

    public static void main(String[] args) {
        // Using Apache Commons IO's IOCase functionality
        String str1 = "Hello";
        String str2 = "HELLO";

        // Check if two strings are equal, using case-sensitive comparison
        boolean caseSensitiveEqual = IOCase.SENSITIVE.checkEquals(str1, str2);
        System.out.println("Strings are equal using case-sensitive comparison: " + caseSensitiveEqual);

        // Check if two strings are equal, using case-insensitive comparison
        boolean caseInsensitiveEqual = IOCase.INSENSITIVE.checkEquals(str1, str2);
        System.out.println("Strings are equal using case-insensitive comparison: " + caseInsensitiveEqual);
    }
}