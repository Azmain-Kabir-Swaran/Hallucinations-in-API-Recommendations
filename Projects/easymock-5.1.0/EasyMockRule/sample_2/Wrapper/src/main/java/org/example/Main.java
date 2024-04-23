package org.example;

import org.easymock.EasyMockRule;
import org.easymock.EasyMockSupport;
import org.junit.Rule;
import org.junit.Test;

public class Main extends EasyMockSupport {

    @Rule
    public EasyMockRule rule = new EasyMockRule(this);

    @Test
    public void myTest() {
        // create your mock or stub object
        MyClass myMock = mock(MyClass.class);

        // define the behavior of your mock
        expect(myMock.someMethod("param")).andReturn("expectedResult");

        // replay your mock so that it behaves like it has been invoked
        replay(myMock);

        // use your mock or stub object in the rest of the code
        String result = myMock.someMethod("param");

        // verify that the method was indeed invoked
        verify(myMock);

        // additional assertions
        assertEquals("expectedResult", result);
    }
}