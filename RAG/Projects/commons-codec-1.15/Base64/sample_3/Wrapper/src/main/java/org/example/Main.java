package org.example;


import org.apache.commons.codec.binary.Base64;

public class Main {
    public static void main(String[] args) {
        String originalInput = "Hello World";
        byte[] originalInputBytes = originalInput.getBytes();
        byte[] encodedBytes = Base64.encodeBase64(originalInputBytes);
        String encodedString = new String(encodedBytes);
        System.out.println("Base64 encoded string: " + encodedString);
    }
}