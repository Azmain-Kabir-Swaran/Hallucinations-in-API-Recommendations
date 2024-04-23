package org.example;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;

public class Main {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MainTest.class);
        System.out.println(result.wasSuccessful());
    }
}