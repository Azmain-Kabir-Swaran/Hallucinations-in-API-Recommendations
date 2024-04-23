package org.example;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Main {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(TestClass1.suite());
    }
}