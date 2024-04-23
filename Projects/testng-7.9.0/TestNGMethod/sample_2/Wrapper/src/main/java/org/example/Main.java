package org.example;

import org.testng.IMethodInstance;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.Test;

public class Main {
    
    @Test
    public void test() {
        ITestContext context = new ITestContext() {
            // Implement ITestContext methods here, but they aren't necessary for the example.
        };

        IMethodInstance methodInstance = new IMethodInstance() {
            // Implement IMethodInstance methods here, but they aren't necessary for the example.
        };

        ITestNGMethod method = new ITestNGMethod() {
            // Implement ITestNGMethod methods here, but they aren't necessary for the example.
        };

        method.getMethodName();
        method.getTestClass();
        method.getTestInstance(context);
        method.getName();
        method.getParameterTypes();
        method.getConstructorOrMethod();
        method.getBeforeGroups();
        method.getAfterGroups();
        method.getGroups();
        method.getDescription();
        method.getPriority();
        method.getXmlTestName();
    }
}