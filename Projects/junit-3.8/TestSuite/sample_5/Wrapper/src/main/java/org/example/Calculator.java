package org.example;

import junit.framework.TestSuite;
import junit.framework.TestResult;
import junit.framework.Test;
import junit.framework.TestCase;
import java.util.*;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}