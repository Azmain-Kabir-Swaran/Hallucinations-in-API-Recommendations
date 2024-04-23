package org.example;


import jakarta.mail.internet.MimeUtility;

public class Main {
    public static void main(String[] args) {
        String exampleText = "The quick brown fox jumps over the lazy dog.";
        try {
            String encodedWord = MimeUtility.encodeWord(exampleText, "utf-8", "B");
            System.out.println("Encoded word: " + encodedWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}