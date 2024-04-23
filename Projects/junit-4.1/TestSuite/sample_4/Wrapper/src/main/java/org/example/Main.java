package org.example;


import junit.framework.Test;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class CalculatorTest extends TestSuite {
    public CalculatorTest(String name) {
        super(name);
        addTest(new TestSuite(CalculatorTestCase.class));
    }

    public static void main(String[] args) {
        TestRunner.run(CalculatorTest.class);
    }
}