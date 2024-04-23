package org.example;

import org.easymock.EasyMockRule;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junitx.Test;

class Main {
    
    @Rule
    public EasyMockRule mocker = new EasyMockRule(this);
    
    @Test
    public void testMethod() {
        //Arrange
        MyInterface mockedObject = EasyMock.createMock(MyInterface.class);
        EasyMock.expect(mockedObject.myMethod()).andReturn("Hello, Mock!");
        EasyMock.replay(mockedObject);
        
        //Act
        String result = mockedObject.myMethod();
        
        //Assert
        EasyMock.verify(mockedObject);
        System.out.println(result);
    }
    
    private interface MyInterface {
        String myMethod();
    }
}