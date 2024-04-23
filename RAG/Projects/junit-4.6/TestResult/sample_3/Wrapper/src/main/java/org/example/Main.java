package org.example;


import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExampleTest {
    
    @Test
    public void testMethod1() {
        // test code
    }
    
    @Test
    public void testMethod2() {
        // test code
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ExampleTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}