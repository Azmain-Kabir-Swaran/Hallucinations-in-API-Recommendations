package org.example;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junitresult.Failure;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}