package org.example;


import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.EncoderException;

public class Main {
    public static void main(String[] args) {
        try {
            String input = "Input String";
            String encoded = Base64.encodeBase64String(input.getBytes());
            System.out.println("Encoded String: " + encoded);

            byte[] decodedBytes = Base64.decodeBase64(encoded);
            String decoded = new String(decodedBytes);
            System.out.println("Decoded String: " + decoded);
        } catch (EncoderException e) {
            System.out.println("An error occurred while encoding or decoding: " + e.getMessage());
        }
    }
}