package org.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Main {
    @Test
    public void test() {
        //Create mock
        List mockedList = Mockito.mock(ArrayList.class);

        //use mock to test the behavior of the method
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());

        //call the method you are testing
        String result = mockedList.get(0);
        assert "first".equals(result);

        try {
            mockedList.get(1);
            Assertions.fail("Expected an RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            //this assertion will pass since you have mocked the behaviour of method get()
            Assertions.assertEquals("second", ex.getMessage());
        }
    }
}