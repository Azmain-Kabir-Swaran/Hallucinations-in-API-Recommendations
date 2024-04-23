package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Main {

    @Mock
    private MyService myService;

    @InjectMocks
    private MyClassUnderTest myClassUnderTest;

    @Test
    void testSomeMethod() {
        when(myService.doSomething()).thenReturn(1);

        int result = myClassUnderTest.someMethod();

        verify(myService).doSomething();
    }
}