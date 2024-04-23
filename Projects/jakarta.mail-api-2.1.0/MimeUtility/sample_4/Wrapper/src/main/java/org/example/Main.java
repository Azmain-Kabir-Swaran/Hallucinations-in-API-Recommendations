package org.example;


import jakarta.mail.internet.MimeUtility;

public class Main {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String encodedString = MimeUtility.encodeText(input);
        String decodedString = MimeUtility.decodeText(encodedString);
        
        System.out.println("Original String: " + input);
        System.out.out.println("Encoded String: " + encodedString);
        System.out.println("Decoded String: " + decodedString);
    }
}