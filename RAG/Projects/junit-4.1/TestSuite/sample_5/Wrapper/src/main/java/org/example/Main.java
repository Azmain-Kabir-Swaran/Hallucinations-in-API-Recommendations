package org.example;


import org.junit.*;
import org.junit.Test;
import org.junit.TestSuite;

public class Main {
    public static void main(String[] args) {
        JUnitCore.runClasses(new TestSuite(MyTest.class));
    }
}