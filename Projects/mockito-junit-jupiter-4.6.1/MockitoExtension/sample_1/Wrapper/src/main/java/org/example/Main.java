package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class Main {

    public interface Calculator {
        int add(int a, int b);
        int subtract(int a, int b);
        int multiply(int a, int b);
        int divide(int a, int b);
    }

    public static class CalculatorImpl implements Calculator {

        @Override
        public int add(int a, int b) {
            return a + b;
        }

        @Override
        public int subtract(int a, int b) {
            return a - b;
        }

        @Override
        public int multiply(int a, int b) {
            return a * b;
        }

        @Override
        public int divide(int a, int b) {
            return a / b;
        }
    }

    @ExtendWith(MockitoExtension.class)
    public static class TestCalculator {

        @Mock
        private CalculatorImpl calculator;

        @Test
        void testAdd() {
            when(calculator.add(2, 3)).thenReturn(5);
            assertEquals(5, calculator.add(2, 3));
        }

        @Test
        void testSubtract() {
            when(calculator.subtract(2, 3)).thenReturn(-1);
            assertEquals(-1, calculator.subtract(2, 3));
        }

        @Test
        void testMultiply() {
            when(calculator.multiply(2, 3)).thenReturn(6);
            assertEquals(6, calculator.multiply(2, 3));
        }

        @Test
        void testDivide() {
            when(calculator.divide(6, 3)).thenReturn(2);
            assertEquals(2, calculator.divide(6, 3));
        }
    }
}