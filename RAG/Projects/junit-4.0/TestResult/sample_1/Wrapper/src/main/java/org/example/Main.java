package org.example;


import org.junit.Test;
import org.junit.TestResult;
import org.junit.runner.JUnitCore;

public class Main {

    public static void main(String[] args) {
        JUnitCore core = new JUnitCore();
        TestResult result = new TestResult();
        core.run(Test.class, result); // you need to replace 'Test.class' with the actual test class
    }
}