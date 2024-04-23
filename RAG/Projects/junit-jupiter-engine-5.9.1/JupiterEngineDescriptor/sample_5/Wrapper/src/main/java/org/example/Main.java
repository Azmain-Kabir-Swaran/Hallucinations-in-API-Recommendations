package org.example;


import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.JupiterEngineDescriptor;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestEngine;

public class Main {

    public static void main(String[] args) {
        // Test engine initialization goes here
        TestEngine testEngine = (TestEngine) ExtensionContext.getOrFail("engine");

        TestDescriptor rootTestDescriptor = testEngine.getTestEngineId().getEngineDescriptor().getRootTestDescriptor();

        // Output the root test descriptor to console
        System.out.println(rootTestDescriptor);
    }
}