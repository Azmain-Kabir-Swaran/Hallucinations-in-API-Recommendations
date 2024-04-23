package org.example;


import org.apache.commons.codec.binary.Base64;

public class Main {
    public static void main(String[] args) {
        String originalInput = "Original Text";

        // Encoding the original input using Base64
        byte[] bytesEncoded = Base64.encodeBase64(originalInput.getBytes());
        String encodedString = new String(bytesEncoded);
        System.out.println("Encoded string using Base64: " + encodedString);

        // Decoding the previously encoded string
        byte[] bytesDecoded = Base64.decodeBase64(encodedString.getBytes());
        String decodedString = new String(bytesDecoded);
        System.out.println("Decoded string using Base64: " + decodedString);
    }
}