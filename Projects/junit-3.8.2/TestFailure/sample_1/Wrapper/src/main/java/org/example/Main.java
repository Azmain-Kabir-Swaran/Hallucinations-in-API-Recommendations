package org.example;


import java.io.*;
import org.junit.*;
import org.junit.Assert;

public class Main {

    public static void main(String[] args) {
        // Testing the TestFailure class
        try {
            int a = 0;
            int b = 1;
            if (a > b) {
                throw new TestFailure("Comparison is failing as expected.");
            }
            Assert.assertEquals(b, b);
        } catch (TestFailure testFailure) {
            testFailure.printStackTrace();
        }
    }
}