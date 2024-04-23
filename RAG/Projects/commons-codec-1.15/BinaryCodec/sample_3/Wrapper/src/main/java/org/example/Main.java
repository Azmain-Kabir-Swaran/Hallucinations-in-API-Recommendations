package org.example;


import org.apache.commons.codec.binary.BinaryCodec;
import org.apache.commons.codec.DecoderException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws DecoderException {
        String input = "Hello World";
        
        byte[] inputBytes = input.getBytes(StandardCharsets.UTF_8);
        
        // Encoding
        byte[] encodedBytes = BinaryCodec.encode("Example", inputBytes);
        System.out.println("Encoded bytes: " + new String(encodedBytes));
        
        // Decoding
        byte[] decodedBytes = BinaryCodec.decode("Example", encodedBytes);
        String decodedString = new String(decodedBytes, StandardCharsets.UTF_8);
        System.out.println("Decoded string: " + decodedString);
    }
}