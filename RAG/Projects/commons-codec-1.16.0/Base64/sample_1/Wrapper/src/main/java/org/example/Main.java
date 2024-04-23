package org.example;


import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.binary.Base64;

public class Main {
    public static void main(String[] args) {
        String originalString = "Hello, Base64!This is a sample string.";

        try {
            //encoding
            byte[] encodedBytes = Base64.encodeBase64(originalString.getBytes("utf-8"));
            System.out.println("Encoded String: " + new String(encodedBytes));

            //decoding
            byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
            System.out.println("Decoded String: " + new String(decodedBytes, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}