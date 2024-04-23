package org.example;


import org.apache.commons.io.IOCase;

public class Main {

    public static void main(String[] args) {
        
        // IOCase example
        System.out.println(IOCase.SYSTEM.checkEquals("HELLO", "hello"));  // Outputs: true
        System.out.println(IOCase.SYSTEM.checkEquals("HELLO", "WORLD"));  // Outputs: false
    }
}