package org.example;


import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static int incrementNumber(int number) {
        return number + 1;
    }

    @Test public void testIncrementNumber() {
        Assert.assertEquals(2, incrementNumber(1));
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Main.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}