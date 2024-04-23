package org.example;

import org.junit.TestDecorator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

public class Main {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 7);
        assertEquals(12, sum);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }
    }
}