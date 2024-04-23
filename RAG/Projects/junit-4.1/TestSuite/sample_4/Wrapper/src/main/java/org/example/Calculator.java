package org.example;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return a / (b * 1.0);
    }
}