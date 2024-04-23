package org.example;


import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class Main {

    public static void main(String[] args) {
        TestSuite suite = new TestSuite(MainTest.class);
        TestRunner.run(suite);
    }
}