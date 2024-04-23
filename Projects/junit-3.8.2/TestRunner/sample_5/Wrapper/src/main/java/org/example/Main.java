package org.example;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junitorg.junit.Test;

public class Main {
    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(MyTest.class);
        System.out.println(result.wasSuccessful());
    }
}