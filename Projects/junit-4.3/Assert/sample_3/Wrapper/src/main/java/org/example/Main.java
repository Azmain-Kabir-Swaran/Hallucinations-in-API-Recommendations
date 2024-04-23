package org.example;


import junit.framework.TestCase;

public class Main extends TestCase {

    public static void main(String[] args) {
        System.out.println("Main is running.");
        TestCase testCase = new TestCase("myFirstTest");
        testCase.run();
    }

    public void myFirstTest() {
        int a = 5, b = 10;
        int expectedResult = 15;
        int actualResult = a + b;

        assertEquals(expectedResult, actualResult);
    }

    public void mySecondTest() {
        int a = 10, b = 10;
        int expectedResult = 20;
        int actualResult = a + b;

        assertEquals(expectedResult, actualResult);
    }
}