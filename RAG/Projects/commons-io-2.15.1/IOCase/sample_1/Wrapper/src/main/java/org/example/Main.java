package org.example;


import org.apache.commons.io.IOCase;

public class Main {

    public static void main(String[] args) {
        String text = "Hello";
        String check = "hello";
        IOCase ioCase = IOCase.SENSITIVE;
        System.out.println(IOCase.IGNORANCE.checkEquals(text, check)); // Output will be false
        System.out.println(IOCase.IGNORANCE.checkStart(text, check)); // Output will be true
        System.out.println(ioCase.checkEquals(text, check)); // Output will be false
        System.out.println(ioCase.checkStart(text, check)); // Output will be false

    }
}