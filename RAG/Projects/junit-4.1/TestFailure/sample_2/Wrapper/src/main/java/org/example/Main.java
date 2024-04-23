package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.TestFailure;
import java.util.*;

public class Main {
    @Test
    public void testArrayListIsEmpty() {
        ArrayList<Object> testArrayList = new ArrayList<>();
        try {
            if (!testArrayList.isEmpty()) {
                throw new TestFailure();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}