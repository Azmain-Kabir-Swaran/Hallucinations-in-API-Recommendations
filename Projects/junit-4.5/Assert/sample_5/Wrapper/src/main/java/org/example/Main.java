package org.example;


import org.junit.Test;
import static org.junit.Assert.*;

public class Main {
    @Test
    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine", str);
    }

    public static void main(String[] args) {
        System.out.println("Main method executing...");
    }
}