package org.example;


import org.apache.commons.lang3.CharEncoding;

public class Main {
    public static void main(String[] args) {
        // This is the example of using CharEncoding API from commons-lang3-3.14.0.
        String encoded = "This is a test.".getBytes(CharEncoding.UTF_8).toString();
        System.out.println("Encodded String: " + encoded);
    }
}