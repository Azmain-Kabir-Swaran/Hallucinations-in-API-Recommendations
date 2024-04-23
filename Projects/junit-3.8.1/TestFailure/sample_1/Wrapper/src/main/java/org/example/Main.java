package org.example;


import junit.framework.TestCase;
import junit.framework.TestFailure;

public class Main extends TestCase {

    public void testSomething() {
        // Assuming we have a method that does something:
        int[] expected = {1, 2, 3};
        int[] actual = methodThatDoesSomething();

        // We can use TestFailure API to assert arrays are equal:
        try {
            assertArrayEquals(expected, actual);
        } catch (AssertionFailedError e) {
            throw new TestFailure(e);
        }
    }

    public int[] methodThatDoesSomething() {
        // Let's pretend we are doing something, but for the purposes
        // of this example let's return a fixed value:
        return new int[] {1, 2, 3};
    }

    public static void main(String[] args) {
        Main test = new Main();
        test.testSomething();
    }
}