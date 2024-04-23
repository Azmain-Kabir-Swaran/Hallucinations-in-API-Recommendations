package org.example;


import org.junit.ComparisonFailure;
import org.junit.Test;

public class Main {
    
    @Test
    public void test() {
        try {
            // write the code here that may throw a ComparisonFailure
            throw new ComparisonFailure("message", "expected", "actual");
        } catch (ComparisonFailure e) {
            // handle the comparison failure exception
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.test();
    }
}