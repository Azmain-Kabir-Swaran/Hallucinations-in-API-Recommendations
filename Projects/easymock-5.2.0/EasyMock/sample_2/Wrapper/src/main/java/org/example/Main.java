package org.example;

import org.easymock.EasyMock;
import java.util.Random;

public class Main {
    public static void main(String args[]) throws Exception {
        // Create mock for Random class
        Random randomMock = EasyMock.createMock(Random.class);
        // Set expectation to generate random number 5
        EasyMock.expect(randomMock.nextInt(10)).andReturn(5);
        // Activate the previous expectation
        EasyMock.replay(randomMock);
        // Start using the mocked Random object
        int number = randomMock.nextInt(10);
        // Print out the generated number
        System.out.println("Generated Number: " + number);
        // Print if the number is even
        System.out.println("Is the number even? " + (number % 2 == 0 ? "Yes" : "No"));
        // Verify that all expectations are fulfilled
        EasyMock.verify(randomMock);
    }
}