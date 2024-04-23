package org.example;


import org.testng.TestNG;

public class Main {

    public static void main(String[] args) {
        // Create a TestNG object
        TestNG testNG = new TestNG();

        // Add test class to the TestNG object
        testNG.addTest("TestRunner");

        // Run the tests
        testNG.run();
    }
}