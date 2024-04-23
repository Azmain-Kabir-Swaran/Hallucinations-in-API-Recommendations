package org.example;


import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Example usage of Assert.assertEquals()
        Assert.assertEquals("The numbers are not equal", num1, num2);

        // The assertion will fail because num1 and num2 are not the same
        // If the assertion passes, the program will continue to run
    }
}