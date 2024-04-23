package org.example;


import java.nio.charset.StandardCharsets;
import org.apache.commons.codec.binary.Base64;

public class Main {

  public static void main(String[] args) {

    String originalInput = "Hello, World!";
    
    byte[] encodedBytes = Base64.encodeBase64(originalInput.getBytes());
    String encodedString = new String(encodedBytes, StandardCharsets.UTF_8);
    System.out.println("Base64 encoded: " + encodedString);
    
    byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
    String decodedString = new String(decodedBytes, StandardCharsets.UTF_8);
    System.out.println("Base64 decoded: " + decodedString);
  }
}