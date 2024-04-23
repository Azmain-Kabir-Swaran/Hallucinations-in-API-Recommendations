package org.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    
    @Test
    public void testMethod(){
        Assert.assertEquals("Text", "Text");
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Main.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}