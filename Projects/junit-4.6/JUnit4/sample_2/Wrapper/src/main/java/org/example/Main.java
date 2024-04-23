package org.example;


import org.junit.Assert;
import org.junit.Test;

public class Main {

    @Test
    public void testAddition(){
        int result = addition(2, 3);
        Assert.assertEquals(5, result);
    }

    public int addition(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(new Main().addition(2,3));
    }
}