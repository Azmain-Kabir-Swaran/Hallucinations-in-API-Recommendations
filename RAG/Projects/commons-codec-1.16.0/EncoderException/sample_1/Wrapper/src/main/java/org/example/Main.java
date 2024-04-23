package org.example;


import org.apache.commons.codec.binary.Base64;

public class Main {
    public static void main(String[] args) {
        String originalInput = "Hello, World!";
        
        byte[] bytesEncoded = Base64.encodeBase64(originalInput.getBytes());
        System.out.println("Base64 encoded string " + new String(bytesEncoded));

        byte[] bytesDecoded = Base64.decodeBase64(bytesEncoded);
        System.out.println("Original string: " + new String(bytesDecoded));
    }
}