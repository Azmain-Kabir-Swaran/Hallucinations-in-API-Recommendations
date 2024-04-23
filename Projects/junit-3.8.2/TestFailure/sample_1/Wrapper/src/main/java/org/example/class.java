package org.example;

import java.io.*;
import org.junit.*;
import org.junit.Assert;

class
class TestFailure extends Throwable {

    public TestFailure(String errorMessage) {
        super(errorMessage);
    }
}