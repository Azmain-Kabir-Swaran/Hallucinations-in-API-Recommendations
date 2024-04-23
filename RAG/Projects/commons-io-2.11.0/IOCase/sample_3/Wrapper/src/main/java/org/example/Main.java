package org.example;


import org.apache.commons.io.IOCase;

public class Main {
    public static void main(String[] args) {
        IOCase ioCase = IOCase.SENSITIVE;
        System.out.println(ioCase.checkEquals("test", "TEST")); // will print "false"
        System.out.println(ioCase.checkEquals("test", "Test")); // will print "true"
        System.out.println(ioCase.checkStart("test", "t")); // will print "false"
        System.out.println(ioCase.checkStart("test", "T")); // will print "true"
    }
}