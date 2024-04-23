package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.internal.runners.statements.Fail;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class Main {
    
    @Test
    public void testMain() {
        // your actual test code here
    }
    
    public static void main(String args[]) {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.run(Main.class);
    }
}