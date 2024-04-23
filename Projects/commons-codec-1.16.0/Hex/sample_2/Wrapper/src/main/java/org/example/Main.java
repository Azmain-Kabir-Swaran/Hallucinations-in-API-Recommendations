package org.example;


import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.binary.Hex;

public class Main {
    public static void main(String[] args) {
        // input message
        String message = "Hello, world!";

        // calculate the digest
        byte[] sha256 = DigestUtils.sha256(message);
        
        // encode digest in hex
        String hex = Hex.encodeHexString(sha256);
        
        System.out.println("Message: " + message);
        System.out.println("Message Digest (SHA-256): " + hex);
    }
}