package org.example;

import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class Main {

    @Rule
    public TestRule rule = new EasyMockRule(this);

    @Mock
    private Calculator calculator;

    @Test
    public void testCalculator() {
        calculator.add(1, 2);
        EasyMock.expectLastCall();
        calculator.add(1, 3);
        EasyMock.expectLastCall();

        calculator.multiply(1, 2);
        EasyMock.expectLastCall();

        calculator.divide(1, 2);
        EasyMock.expectLastCall();

        EasyMock.replay(calculator);

        calculator.add(1, 2);
        calculator.add(1, 3);
        calculator.multiply(1, 2);
        calculator.divide(1, 2);

        EasyMock.verify(calculator);
    }
}