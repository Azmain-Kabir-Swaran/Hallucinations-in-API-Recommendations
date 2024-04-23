package org.example;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class Main {

    @Test
    public void testSum() {
        // Mock creation
        List<Integer> listMock = mock(List.class);

        // Setting up mock
        when(listMock.size()).thenReturn(10);

        // Testing behavior
        assertEquals(10, listMock.size());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.testSum();
    }
}