package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        assertTrue(main.isEvenNumber(4), "4 should be an even number");
        assertFalse(main.isEvenNumber(7), "7 should not be an even number");
    }

    public boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    @Test
    void isEvenNumberTest() {
        Main main = new Main();
        assertTrue(main.isEvenNumber(4));
        assertFalse(main.isEvenNumber(7));
    }
}