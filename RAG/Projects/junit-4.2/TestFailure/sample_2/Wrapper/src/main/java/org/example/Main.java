package org.example;

import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.experimental.results.ResultMatchers;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;

public class Main {

    @Test
    public void someTest() {
        Assertions.assertThat("some text").isEqualTo("some text");
        Assertions.assertThatCode(() -> {
            throw new RuntimeException("some exception");
        }).fails().withFailMessage("expected exception not thrown");
        Assertions.assertThat(42).isNotNull();
    }
}