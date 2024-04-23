package org.example;


import junit.framework.*;
import junit.framework.TestSuite;

public class Main {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(TestCase1.suite());
    }
}