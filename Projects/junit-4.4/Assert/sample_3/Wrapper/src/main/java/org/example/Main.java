package org.example;


import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        int result = multiply(10, 5);
        Assert.assertEquals("Result should equal 50", 50, result);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}