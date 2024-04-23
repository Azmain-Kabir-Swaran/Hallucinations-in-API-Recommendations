package org.example;


import org.apache.commons.codec.binary.Base64;

public class Main {

    public static void main(String[] args) {
        try {
            String encoded = Base64.encodeBase64String("Hello, World!".getBytes());
            System.out.println(encoded);
        } catch (org.apache.commons.codec.binary.EncoderException ex) {
            System.err.println("An error occurred: " + ex);
        }
    }
}