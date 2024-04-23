package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import java.util.stream.Stream;

class TestSuite {

    @TestTemplate
    @ExtendWith(ClassToTest.class)
    void testSuite(ExtensionContext context) {
        Stream.of("testIncrement").forEach(testName -> {
            final var dynamicTest = context.getStore(ExtensionContext.Namespace.create(getClass(), context.getRequiredTestMethod()))
                    .get(testName, String.class);
            context.getTestMethod().ifPresent(method -> {
                method.execute(context);
            });
        });
    }

    static class TestExecutionListener extends AbstractTestExecutionListener {
        @Override
        public void dynamicTestRegistered(final TestDescriptor testDescriptor) {
            testDescriptor.getStore(ExtensionContext.Namespace.create(TestSuite.class, testDescriptor)).put("test", testDescriptor.getDisplayName());
        }
    }
}