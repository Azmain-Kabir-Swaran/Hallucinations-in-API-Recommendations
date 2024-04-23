package org.example;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Main {

    public double calculateHypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    @Test
    public void testCalculateHypotenuse() {
        Main m = new Main();
        assertEquals("Checking hypotenuse of 3 and 4", 5.0, m.calculateHypotenuse(3, 4), 0.0);
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("Hypotenuse is: " + m.calculateHypotenuse(3, 4));
    }
}