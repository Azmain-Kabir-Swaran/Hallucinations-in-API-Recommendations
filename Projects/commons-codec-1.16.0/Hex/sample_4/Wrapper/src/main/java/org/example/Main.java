package org.example;


import org.apache.commons.codec.binary.Hex;

public class Main {

    public static void main(String[] args) {
        String hex = "48656c6c6f20576f726c64"; // "Hello World" in hexadecimal
        byte[] bytes = Hex.decodeHex(hex);
        String decodedString = new String(bytes);
        System.out.println(decodedString);
    }
}