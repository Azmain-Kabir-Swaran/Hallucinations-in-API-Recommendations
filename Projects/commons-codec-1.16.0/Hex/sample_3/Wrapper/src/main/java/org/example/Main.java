package org.example;


import org.apache.commons.codec.binary.Hex;

public class Main {

    public static void main(String[] args) {
        String input = "Hello World";
        String hex = Hex.encodeHexString(input.getBytes());
        System.out.println("Input string: " + input);
        System.out.println("Hex string: " + hex);
        byte[] bytes = Hex.decodeHex(hex.toCharArray());
        String output = new String(bytes);
        System.out.println("Output string: " + output);
    }
}