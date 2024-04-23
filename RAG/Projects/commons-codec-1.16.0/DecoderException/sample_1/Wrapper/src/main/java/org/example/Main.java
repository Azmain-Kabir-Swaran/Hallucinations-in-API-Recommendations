package org.example;


import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.DecoderException;

public class Main {
    public static void main(String[] args) throws DecoderException {
        String encoded = Base64.encodeBase64String("This is a test.".getBytes());
        byte[] decoded = Base64.decodeBase64(encoded);
        System.out.println(new String(decoded));
    }
}