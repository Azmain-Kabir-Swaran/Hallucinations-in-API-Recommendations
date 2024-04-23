package org.example;


import jakarta.mail.internet.MimeUtility;

public class Main {

    public static void main(String[] args) throws Exception {

        // Encoding a string
        String encodedString = MimeUtility.encodeText("This is a test");
        System.out.println("Encoded String: " + encodedString);

        // Decoding a string
        String decodedString = MimeUtility.decode(encodedString, "ISO-2022-JP");
        System.out.println("Decoded String: " + decodedString);

    }

}