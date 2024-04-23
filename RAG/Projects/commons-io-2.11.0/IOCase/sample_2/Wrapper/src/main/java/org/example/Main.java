package org.example;


import org.apache.commons.io.IOCase;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "HELLO";

        // Usage of IOCase API
        boolean match = IOCase.INSENSITIVE.checkEquals(str1, str2);
        System.out.println(match); // It will output true
    }
}