package org.example;


import org.junit.internal.runners.statements.ExpectException;
import org.junit.internal.runners.model.MultipleFrs;
import org.junit.Test;
import org.junit.Assert;
import java.util.HashMap;

public class Main {
    @Test
    public void myTest() {
        Assert.assertEquals(4, 2+2);
    }

    public static void main(String[] args) {
        Main main = new Main();
        ExpectException statement = new ExpectException(MultipleFrs.from(new Object() {
            private HashMap<String, String> myMap = new HashMap<String, String>();
        }));
        statement.evaluate();
        main.myTest();
    }
}