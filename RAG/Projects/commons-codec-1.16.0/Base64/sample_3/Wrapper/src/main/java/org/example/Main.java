package org.example;


import org.apache.commons.codec.binary.Base64;

public class Main {
   public static void main(String[] args) {
      String text = "Hello, Base64! This is a test string.";
      System.out.println("Text Before Encoding: " + text);

      byte[] binaryData = text.getBytes();
      byte[] base64Data = Base64.encodeBase64(binaryData);
      System.out.println("Base64 Encoding: " + new String(base64Data));

      byte[] decodedData = Base64.decodeBase64(base64Data);
      System.out.println("Text After Decoding: " + new String(decodedData));
   }
}