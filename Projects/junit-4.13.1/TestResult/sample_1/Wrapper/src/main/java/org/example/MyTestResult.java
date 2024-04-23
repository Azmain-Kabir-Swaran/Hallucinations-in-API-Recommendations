package org.example;

import org.junit.runner.notification.Failure;

public class MyTestResult extends TestResult {
    
    public MyTestResult() {
        super();
    }
    
    // Override and use methods provided by TestResult

    @Override
    public void addFailure(Failure failure) {
        super.addFailure(failure);
    }

    public int runTests() {
        return this.runTests(null);
    }
    
    // Other methods defined in TestResult are also available
}