package org.example;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestNgFactoryTest {

    private String name;

    public TestNgFactoryTest(String name) {
        this.name = name;
    }

    @Test
    public void testMethod() {
        System.out.println(name);
    }

    @DataProvider
    public Object[][] provideData() {
        return new Object[][] {
                {"test1"},
                {"test2"},
                {"test3"}
        };
    }

    @Factory(dataProvider = "provideData")
    public static Object[] createInstances(ITestContext ctx) {
        ITestNGMethod[] tests = ctx.getAllTestMethods();
        Object[] instances = new Object[tests.length];
        for (int i = 0; i < tests.length; i++) {
            instances[i] = new TestNgFactoryTest(tests[i].getParameters()[0].getParameter());
        }
        return instances;
    }
}