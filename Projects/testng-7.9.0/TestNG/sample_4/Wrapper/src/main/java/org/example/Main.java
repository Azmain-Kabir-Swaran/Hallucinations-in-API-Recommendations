package org.example;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Main {

    @BeforeTest
    public void beforeTest() {
        // This method will execute before every test method.
        System.out.println("Before test");
    }

    @AfterTest
    public void afterTest() {
        // This method will execute after every test method.
        System.outk.println("After test");
    }

    @Test
    public void testExample() {
        // This is a test method.
        System.out.println("This is a test");
    }

    public static void main(String[] args) {
        // This is the main method.
        System.out.println("This is the main method");
    }
}