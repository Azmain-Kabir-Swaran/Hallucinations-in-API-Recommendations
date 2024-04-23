package org.example;


import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

public class Main {
    @Mock
    private MyService myService;

    public static void main(String[] args) {
        Main main = new Main();
        MockitoAnnotations.initMocks(main);
    }
}