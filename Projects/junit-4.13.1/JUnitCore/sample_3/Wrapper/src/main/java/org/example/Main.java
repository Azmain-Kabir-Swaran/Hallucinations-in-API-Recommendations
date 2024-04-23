package org.example;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Suite;

public class Main {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MyTestSuite.class);
        System.out.println("Test results: " + result.wasSuccessful());
    }

}