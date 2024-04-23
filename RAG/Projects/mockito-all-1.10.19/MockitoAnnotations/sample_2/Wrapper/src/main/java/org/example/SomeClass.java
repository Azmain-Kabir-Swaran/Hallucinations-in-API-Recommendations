package org.example;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

class SomeClass {
    private SomeDependency someDependency;
    
    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
    }
    
    public int doSomething() {
        return someDependency.someMethod() + 2;
    }
}