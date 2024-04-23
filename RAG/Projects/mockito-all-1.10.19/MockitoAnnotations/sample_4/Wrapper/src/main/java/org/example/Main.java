package org.example;


import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

public class Main {

    @Mock
    private MyInterface myInterface;

    public static void main(String[] args) {
        Main main = new Main();
        MockitoAnnotations.initMocks(main);
        System.out.println(main.myInterface.toString());
    }
}