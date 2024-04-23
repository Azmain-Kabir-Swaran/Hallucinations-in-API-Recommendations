package org.example;

import org.easymock.*;
import org.junit.Test;

public class Main {

    @Test
    public void testEasyMock() {
        // create an EasyMock mock
        Calculator calc = EasyMock.createMock(Calculator.class);

        // specify the behavior
        EasyMock.expect(calc.add(5, 7)).andReturn(12);

        // activate the mock
        EasyMock.replay(calc);

        // use the mock
        int result = calc.add(5, 7);
        System.out.println("Result: " + result);

        // verify that behavior
        EasyMock.verify(calc);
    }

    // define an interface
    public interface Calculator {
        int add(int a, int b);
    }
}