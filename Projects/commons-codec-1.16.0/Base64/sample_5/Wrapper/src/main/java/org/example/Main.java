package org.example;


import java.nio.charset.StandardCharsets;
import org.apache.commons.codec.binary.Base64;

public class Main {
    public static void main(String[] args) {
        String text = "Hello, World!";
        
        // Convert string to Base64
        byte[] byteArray = text.getBytes(StandardCharsets.UTF_8);
        String encodedText = Base64.encodeBase64String(byteArray);
        System.out.println("Base64 Encoded text: " + encodedText);
        
        // Decode Base64
        byte[] decodedByteArray = Base64.decodeBase64(encodedText);
        String decodedText = new String(decodedByteArray, StandardCharsets.UTF_8);
        System.out.println("Original text: " + decodedText);
    }
}