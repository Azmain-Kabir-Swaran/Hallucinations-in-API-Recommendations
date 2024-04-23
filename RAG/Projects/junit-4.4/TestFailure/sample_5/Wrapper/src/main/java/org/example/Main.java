package org.example;


import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    @Test
    public void testMethod() {
        Assert.assertTrue("Expected true", true);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Main.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}