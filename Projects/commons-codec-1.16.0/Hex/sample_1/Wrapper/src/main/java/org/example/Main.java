package org.example;


import org.apache.commons.codec.binary.Hex;

public class Main {

    public static void main(String[] args) {
        String originalString = "I love programming!";
        byte[] bytes = originalString.getBytes();
        
        // Convert the string to a Hexadecimal string
        String hexString = Hex.encodeHexString(bytes);
        System.out.println("The hexadecimal representation is: " + hexString);
        
        // Convert the hexadecimal back to a string
        byte[] decodedBytes = Hex.decodeHex(hexString);
        String decodedString = new String(decodedBytes);
        System.out.println("The decoded string is: " + decodedString);
    }

}