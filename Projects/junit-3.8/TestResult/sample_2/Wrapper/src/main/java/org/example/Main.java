package org.example;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Main {

    public static void main(String[] args) {
        TestResult result = new TestResult();
        result.startTest(new TestCase("addition") {
            public void runTest() {
                assertEquals(5, addNumbers(2, 3));
            }
        });
    }

    @Test
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}