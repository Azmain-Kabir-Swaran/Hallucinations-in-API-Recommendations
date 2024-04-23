package org.example;


import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        int actual = 5;
        int expected = 5;
        String message = "Test failed";

        Assert.assertEquals(message, expected, actual);
    }
}