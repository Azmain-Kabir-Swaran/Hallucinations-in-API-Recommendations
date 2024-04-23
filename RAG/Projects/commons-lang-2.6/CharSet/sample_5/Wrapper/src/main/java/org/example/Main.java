package org.example;


import org.apache.commons.lang3.CharSet;
import java.util.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CharSet charSet = new CharSet("ABCD");

        for (Character c : charSet) {
            System.out.println(c);
        }
    }
}