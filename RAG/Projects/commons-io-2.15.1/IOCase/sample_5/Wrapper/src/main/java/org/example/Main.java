package org.example;


import org.apache.commons.io.IOCase;

public class Main {

    public static void main(String[] args) {
        // usage of IOCase API
        boolean equalsIgnoreCase = IOCase.INSENSITIVE.checkEquals("Hello", "hello");
        System.out.println(equalsIgnoreCase); // Prints: true
    }

}