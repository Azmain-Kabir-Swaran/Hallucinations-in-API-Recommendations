package org.example;


import org.apache.commons.codec.binary.Base64;

public class Main {
    public static void main(String[] args) {
        String originalInput = "sample input";
        byte[] bytes = originalInput.getBytes();

        // Encoding using Base64
        byte[] encodedBytes = Base64.encodeBase64(bytes);
        String encodedString = new String(encodedBytes);
        System.out.println("Encoded String: " + encodedString);

        // Decoding from Base64
        byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded String: " + decodedString);
    }
}