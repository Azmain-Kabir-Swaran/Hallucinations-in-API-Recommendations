package org.example;


import org.junit.Test;
import static org.junit.Assert.*;

public class Main{

    //Define method that you want to test
    @Test
    public void myFirstTest() {
        String str = "JUnit";
        // assert statements
        assertEquals("JUnit isn't equal", str, "JUnit");
    }

    public static void main(String[] args) {
        Main testMain = new Main();
        testMain.myFirstTest();
    }
}