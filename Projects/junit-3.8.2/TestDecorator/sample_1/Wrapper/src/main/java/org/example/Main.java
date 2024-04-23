package org.example;

import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import junit.framework.JUnit4TestAdapter;
import junit.framework.TestResult;

public class Main {

    @RunWith(Categories.class)
    @Category(SlowTests.class)
    public static class SlowTestSuite {
    }

    @RunWith(Categories.class)
    @Category(FastTests.class)
    public static class FastTestSuite {
    }

    @Test
    public void test(){
        //Your Test Cases here
    }

}