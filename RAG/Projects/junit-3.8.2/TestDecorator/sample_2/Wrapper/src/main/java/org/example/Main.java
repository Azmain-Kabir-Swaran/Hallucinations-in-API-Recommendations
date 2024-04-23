package org.example;


import junit.framework.TestCase;

public class Main {
    public static void main(String[] args) {
        // Running tests
        TestCalculator testCalculator = new TestCalculator();
        testCalculator.setUp();
        testCalculator.testAdd();
        testCalculator.testSubtract();
    }
}