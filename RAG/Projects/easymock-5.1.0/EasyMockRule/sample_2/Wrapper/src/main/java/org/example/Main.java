package org.example;

import org.easymock.EasyMock;
import org.easymock.EasyMockRule;
import org.junit.Rule;
import org.junit.Test;

public class Main {
    @Rule
    public EasyMockRule em = new EasyMockRule(this);

    class Calculator {
        int add(int a, int b) {
            return a + b;
        }
    }

    @Test
    public void testAdd() {
        Calculator mockedObject = em.mock(Calculator.class);
        EasyMock.expect(mockedObject.add(2, 3)).andReturn(5);
        EasyMock.replay(mockedObject);

        System.out.println(mockedObject.add(2, 3));  // Outputs: 5
    }
}