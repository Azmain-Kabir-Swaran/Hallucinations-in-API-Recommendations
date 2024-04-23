package org.example;


import org.apache.commons.lang3.builder.EqualsBuilder;

public class Main {

    public static void main(String[] args) {
        Example example1 = new Example("John", 30);
        Example example2 = new Example("John", 30);
        Example example3 = new Example("Jane", 25);

        System.out.println("example1.equals(example2) : " + example1.equals(example2));
        System.out.println("example1.equals(example3) : " + example1.equals(example3));
    }
}