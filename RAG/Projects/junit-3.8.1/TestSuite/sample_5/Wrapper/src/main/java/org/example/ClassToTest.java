package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import java.util.stream.Stream;

class ClassToTest {
    private int value;

    @BeforeEach
    void initialize() {
        value = 0;
    }

    int increment() {
        return ++value;
    }

    @Test
    void testIncrement() {
        Assertions.assertEquals(1, increment());
    }
}