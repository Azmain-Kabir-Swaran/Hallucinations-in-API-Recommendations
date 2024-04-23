package org.example;


import org.apache.commons.codec.binary.Base64;

public class Main {
    public static void main(String[] args) {
        String originalInput = "Hello World";
        
        // Convert input string to Base64
        byte[] bytesEncoded = Base64.encodeBase64(originalInput.getBytes());
        
        // Convert the encoded bytes to string
        String encodedString = new String(bytesEncoded);
        System.out.println("Base64 Encoded String: " + encodedString);
        
        // Decode Base64 string back to original String
        byte[] bytesDecoded = Base64.decodeBase64(encodedString);
        String decodedString = new String(bytesDecoded);
        System.out.println("Decoded String: " + decodedString);
    }
}