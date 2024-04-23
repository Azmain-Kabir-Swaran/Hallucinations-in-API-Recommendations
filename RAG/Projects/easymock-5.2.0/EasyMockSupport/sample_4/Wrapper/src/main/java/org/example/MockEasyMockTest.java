package org.example;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.IAnswer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

public class MockEasyMockTest extends EasyMockSupport {
    private TestService testService;

    @Before
    public void setUp() {
        testService = createNiceMock(TestService.class);
    }

    @Test
    public void testMethod() {
        replay(testService);
        // when
        testService.someMethod("param");
        // then
        verify(testService);
    }
}