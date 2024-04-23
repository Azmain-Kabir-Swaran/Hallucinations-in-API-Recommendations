package org.example;


import org.apache.commons.lang3.CharSet;

public class Main {

    public static void main(String[] args) {
        CharSet<Character> charSet = CharSet.of('a', 'b', 'c');
        charSet = charSet.add('d'); // Add a new character
        
        System.out.println(charSet.size()); // Outputs 4
    }
}