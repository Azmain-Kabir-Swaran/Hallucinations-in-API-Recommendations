package org.example;


import org.apache.commons.codec.binary.Base64;

public class Main {
    public static void main(String[] args) {
        String originalInput = "Hello World!";
        byte[] bytes = originalInput.getBytes();
        byte[] encodedBytes = Base64.encodeBase64(bytes);
        String encodedString = new String(encodedBytes);
        System.out.println("Original Input: " + originalInput);
        System.out.println("Encoded String: " + encodedString);

        byte[] decodedBytes = Base64.decodeBase64(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded String: " + decodedString);
    }
}