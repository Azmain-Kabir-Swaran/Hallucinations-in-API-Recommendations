package org.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Main {
    
    @Mock
    private MyDependency myDependency;
    
    @InjectMocks
    private MyClass myClass;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testSomeMethod() {
        myClass.doSomething(100);
    }
    
    static class MyClass {
        private MyDependency myDependency;
        
        public MyClass(MyDependency myDependency) {
            this.myDependency = myDependency;
        }
        
        public void doSomething(int number) {
            myDependency.doSomething(number);
        }
    }
    
    interface MyDependency {
        void doSomething(int number);
    }
}