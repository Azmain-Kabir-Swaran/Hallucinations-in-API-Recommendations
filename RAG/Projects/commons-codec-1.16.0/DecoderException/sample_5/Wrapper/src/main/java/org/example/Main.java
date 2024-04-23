package org.example;


import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.DecoderException;

public class Main {

    public static void main(String[] args) throws DecoderException {
        String encodedString = "SGVsbG8="; // Hello in Base64
        byte[] decodedBytes = Base64.decodeBase64(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString); // Prints: Hello
    }
}