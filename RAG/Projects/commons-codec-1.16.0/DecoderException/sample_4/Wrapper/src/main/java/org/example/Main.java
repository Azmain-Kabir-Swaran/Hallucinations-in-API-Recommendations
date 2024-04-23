package org.example;


import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.DecoderException;

public class Main {

    public static void main(String[] args) {
        String encoded = "SGVsbG8="; // Sample string

        try {
            byte[] decodedBytes = Base64.decodeBase64(encoded);
            String decodedString = new String(decodedBytes);
            System.out.println("Decoded string: " + decodedString);
        } catch (DecoderException e) {
            System.err.println("Failed to decode the string. Reason: " + e.getMessage());
        }
    }
}