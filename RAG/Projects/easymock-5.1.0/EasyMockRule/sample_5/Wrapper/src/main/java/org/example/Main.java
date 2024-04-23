package org.example;

import org.easymock.EasyMock;
import org.easymock.EasyMockRule;
import org.junit.Rule;
import org.junit.Test;

public class Main {

    @Rule
    public EasyMockRule mockRule = new EasyMockRule(this);
    
    MyClass myClass = mockRule.mock(MyClass.class);

    @Test
    public void testMyMethod() {
        EasyMock.expect(myClass.myMethod()).andReturn(true);
        mockRule.replayAll();

        // call the method you want to test
        myClass.myMethod();

        mockRule.verifyAll();
    }
}