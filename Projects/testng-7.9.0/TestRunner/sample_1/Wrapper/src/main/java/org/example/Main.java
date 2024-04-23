package org.example;


import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Main {

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        XmlSuite suite = new XmlSuite();
        XmlTest test = new XmlTest(suite);

        test.setName("TestNG Suite");
        // You need to set this to a specific path on your system
        test.addIncludedGroup("group1");

        // Add your testng.xml file here
        // If not provided, then use default behaviour
        // testng.setTestClasses(new Class[] { YourClass.class });
        testng.addListener(new TestNgListener());
        suite.addTest(test);
        testng.setXmlSuites(new XmlSuite[]{suite});
        testng.run();
    }
}