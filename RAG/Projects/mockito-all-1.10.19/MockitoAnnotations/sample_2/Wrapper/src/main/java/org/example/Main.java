package org.example;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class Main {
    @Mock
    private SomeDependency someDependency;
    @InjectMocks
    private SomeClass someClass;
    
    public Main() {
        MockitoAnnotations.initMocks(this);
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.someClass.doSomething()); // This will actually call the mock implementation
    }
}