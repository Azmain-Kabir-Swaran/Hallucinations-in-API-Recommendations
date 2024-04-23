package org.example;


import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.DecoderException;

public class Main {

    public static void main(String[] args) {
        String input = "Hello, World!";
        
        try {
            // Encode the input
            byte[] encodedBytes = Base64.encodeBase64(input.getBytes());
            System.out.println("Encoded: " + new String(encodedBytes));

            // Decode the input
            byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
            System.out.println("Decoded: " + new String(decodedBytes));
        } catch (DecoderException e) {
            System.out.println("An error occurred during decoding: " + e.getMessage());
        }
    }
}