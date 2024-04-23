package org.example;


import org.apache.commons.io.IOCase;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "HELLO";

        // check if the strings are equal, ignoring case
        if (IOCase.INSENSITIVE_EXACT.checkEquals(str1, str2)) {
            System.out.println("The strings are equal, ignoring case");
        } else {
            System.out.println("The strings are not equal, ignoring case");
        }
    }
}