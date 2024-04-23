package org.example;


import org.apache.commons.codec.binary.Base64;

public class Main {
    public static void main(String[] args) {
        String text = "Sample string to be encoded or decoded";
        byte[] textBytes = text.getBytes();
        
        // Encoding the string
        byte[] encodedBytes = Base64.encodeBase64(textBytes);
        String encodedText = new String(encodedBytes);
        System.out.println("Encoded String: " + encodedText);

        // Decoding the string
        byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
        String decodedText = new String(decodedBytes);
        System.out.println("Decoded String: " + decodedText);
    }
}