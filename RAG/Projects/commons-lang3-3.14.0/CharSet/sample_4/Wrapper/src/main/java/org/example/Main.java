package org.example;


import org.apache.commons.lang3.CharSet;

public class Main {
    public static void main(String[] args) {
        CharSet<Character> charSet = CharSet.of('a', 'b', 'c');
        System.out.println(charSet.toString());

        // You can continue with operations using CharSet API.
    }
}