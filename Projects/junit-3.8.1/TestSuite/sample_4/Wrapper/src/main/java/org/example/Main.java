package org.example;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junitxample.TestSuite;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);
        System.out.println(result.wasSuccessful());
    }
}