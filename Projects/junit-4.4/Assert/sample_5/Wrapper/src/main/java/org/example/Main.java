package org.example;


import org.junit.Assert;

public class Main {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        // Use the assertion API
        Assert.assertEquals("10 should equal to 10", num1, num2);

        System.out.println("Both numbers are equal.");
    }
}