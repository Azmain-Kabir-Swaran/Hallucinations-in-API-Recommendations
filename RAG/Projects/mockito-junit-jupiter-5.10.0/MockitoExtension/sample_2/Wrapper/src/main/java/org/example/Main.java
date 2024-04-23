package org.example;

import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class Main {

    @Mock
    private SampleInterface sample;

    @InjectMocks
    private SampleClass sampleClass;

    @Test
    public void test() {
        when(sample.doSomething()).thenReturn("Hello, World!");
        System.out.println(sampleClass.print());
    }
}