package org.example;


import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class Main {

    @Mock
    private SomeDependency someDependency;

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}