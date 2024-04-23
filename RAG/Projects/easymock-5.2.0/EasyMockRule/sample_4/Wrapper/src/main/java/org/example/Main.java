package org.example;

import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class Main {
    @Rule
    public EasyMockRule mockery = new EasyMockRule(this);
    
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    public interface InterfaceClass {
        String aMethod(String a);
    }
    
    @Test
    public void test() {
        InterfaceClass mock = mockery.createMock(InterfaceClass.class);
        String someString = "Hello";
        
        // Prepare the mock
        EasyMock.expect(mock.aMethod(EasyMock.eq(someString))).andReturn(someString).times(1);
        EasyMock.replay(mock);

        // Call the method we're interested in
        String actualResult = mock.aMethod(someString);

        // Verify we did what we set out to do
        EasyMock.verify(mock);

        // Let's assert the result
        assert(actualResult.equals(someString));

        // Now let's print the output
        System.out.println(actualResult);
    }
}