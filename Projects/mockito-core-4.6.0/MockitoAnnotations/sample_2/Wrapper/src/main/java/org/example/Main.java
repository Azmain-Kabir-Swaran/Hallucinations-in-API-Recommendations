package org.example;


import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

public class Main {

    @Mock
    private Foo foo;

    public static void main(String[] args) {
        Main main = new Main();
        MockitoAnnotations.initMocks(main);
        // Write your main function
    }
}