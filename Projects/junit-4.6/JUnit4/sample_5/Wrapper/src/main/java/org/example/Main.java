package org.example;


import org.junit.Test;
import static org.junit.Assert.*;

public class Main {

    @Test
    public void testAdd() {
        assertEquals(10, add(5,5));
    }
    
    public static int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        testAdd();
    }
}