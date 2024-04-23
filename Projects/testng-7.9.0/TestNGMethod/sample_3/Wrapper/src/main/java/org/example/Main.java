package org.example;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.collections.Lists;
import org.testng.internal.MethodInterceptorAdapter;
import java.util.List;

public class Main implements ISuiteListener {

    @BeforeTest
    public void beforeTest(ITestContext context) {
        List<ITestNGMethod> methods = Lists.newArrayList(context.getTestNGMethods());
        System.out.println("No of methods are: " + methods.size());
    }

    @Test
    public void main(ITestContext context) {
        List<ITestNGMethod> methods = Lists.newArrayList(context.getTestNGMethods());
        System.out.println("No of methods are: " + methods.size());
    }

    public void onStart(ISuite suite) {
        System.out.println("Starting");
    }

    public void onFinish(ISuite suite) {
        System.out.println("Finished");
    }

    public static class TestNGMethodInterceptor extends MethodInterceptorAdapter {
        public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
            return methods;
        }
    }
}