package org.example;


import org.apache.commons.lang3.CharSet;

public class Main {
    public static void main(String[] args) {
        CharSet set = CharSet.of('a', 'b', 'c');
        if (set.contains('a')) {
            System.out.println("CharSet contains 'a'");
        } else {
            System.out.println("CharSet does not contain 'a'");
        }
        if (set.contains('d')) {
            System.out.println("CharSet contains 'd'");
        } else {
            System.out.println("CharSet does not contain 'd'");
        }
    }
}